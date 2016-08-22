package DetectCommonAAs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class StringFetcher {

    public static void fetchStringFromFile(List<String> filesList,
            String resultsPath, String haystackDirString) {
        // fetchStringFromFile() fetches the String of AAs contained in each
        // file

        String aaSeqString = "";
        /*
        // TODO pdbAndChainIdString can later be used in order to calculate
        // frequencies of AAs, if needed
        String pdbAndChainIdString = "";
        */

        List<String> nonRedundantAaList = new ArrayList<>();

        try {
            for (String fileString : filesList) {
                // traverse through each element of List filesList
                File inputFile = new File(fileString);
                // create object file from String fileString in order to read
                // its contents in
                InputStream fileInputStream = new FileInputStream(inputFile);
                // Create Object fileInputStream which holds an input
                // stream with the content of file
                BufferedReader fileReader = new BufferedReader(
                        new InputStreamReader(fileInputStream));
                // read fileInputStream into buffer fileReader
                String lineString;
                // lineString holds the current line contained in fileReader
                while ((lineString = fileReader.readLine()) != null) {
                    // as long as the content of lineString is NOT null,
                    // it is searched if lineString is null, it means we have
                    // reached the end of the file and nothing more is done
                    /*
                    // TODO pdbAndChainIdString can later be used in order to
                    // calculate frequencies of AAs, if needed
                    pdbAndChainIdString =
                            StringUtils.substringBefore(lineString, ",");
                    // store PDB-ID and Chain-ID in String pdbAndChainIdString
                    */
                    aaSeqString = StringUtils.substringAfter(lineString, ",");
                    // store current pdbAndChainIdString's non-redundant AA
                    // sequence in aaSeqString
                    nonRedundantAaList.add(aaSeqString);
                    // store pdbAndChainIdString, aaSeqString
                    // as nonRedundantAaMap's (k,v)
                }
                fileReader.close();
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        CommonAaDetector.detectCommonAAs(resultsPath, nonRedundantAaList,
                haystackDirString);
        // pass parameters with results for detection of common AAs
    }
}