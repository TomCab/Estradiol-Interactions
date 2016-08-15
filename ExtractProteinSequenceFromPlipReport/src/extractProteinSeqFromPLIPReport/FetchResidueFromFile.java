package extractProteinSeqFromPLIPReport;

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

public class FetchResidueFromFile {

    private static String chainString = "";
    private static String positionString = "";
    private static String residue3LetterString = "";
    private static String residue1LetterString = "";
    private static String proteinNameString = "";
    private static String resultsFileNameString = "";


    public static void fetcher(List<String> filesList, String resultsPath) {
        // fetcher() fetches File Name, RMSD and TM-Score for each alignment
        // from that alignment's .score File

        try {
            for (String fileString : filesList) {
                ArrayList<String> chainArrayList = new ArrayList<>();
                ArrayList<String> positionArrayList = new ArrayList<>();
                ArrayList<String> aa3LetterArrayList = new ArrayList<>();
                ArrayList<String> aa1LetterArrayList = new ArrayList<>();
                // work through each element of List filesList
                File file = new File(fileString);
                // create object file from String fileString

                proteinNameString = StringUtils.substringBefore(file.getName(), "-");
                // store name of protein in String proteinNameString

                if (resultsPath.endsWith(File.separator) ) {
                    // check whether resultsPath ends with / or not and create
                    // full name with .csv extension
                    resultsFileNameString = resultsPath 
                            + proteinNameString + ".csv";
                } else {
                    resultsFileNameString = resultsPath + File.separator
                            + proteinNameString + ".csv";
                }
                InputStream fileInputStream =
                        new FileInputStream(file);
                // Create Object fileInputStream which holds an input
                // stream with the content of file
                BufferedReader fileReader = new BufferedReader(
                        new InputStreamReader(fileInputStream));
                // read fileInputStream into buffer fileReader
                String lineString;
                // lineString holds the current line contained in
                // fileReader
                while ((lineString = fileReader.readLine()) != null) {
                    // as long as the content of lineString is NOT null,
                    // it is searched
                    // if lineString is null, it means we have reached
                    // the end of the file and nothing more is done
                    if (lineString.length() > 40 && lineString.substring(1, 2)
                            .matches("\\d+")) {
                        // if lineString is longer than 40 characters and
                        // substring at index 1 is a digit
                        //    chainString = lineString.substring(9, 10);
                        String[] chainArray = lineString.split("\\|");
                        chainString = chainArray[3];
                        // store in chainString a substring within this
                        // range, which contains the chain 
                        String[] positionArray = lineString.split("\\|");
                        positionString = positionArray[1];
                        // store in positionString a substring within this
                        // range, which contains the position
                        String[] residue3LetterArray = lineString.split("\\|");
                        residue3LetterString = residue3LetterArray[2] 
                                .toUpperCase();
                        // store in residue3LetterString a substring within this
                        // range, which contains the three letter code of the 
                        // aminoacid residue
                        residue1LetterString = OneLetterCode.AMINOACIDS
                                .get(residue3LetterString);
                        // convert the aminoacid three letter code into
                        // one letter code and store the result

                        chainArrayList.add(chainString);
                        // store proteinNameString as Key and chainString as Value in
                        // Hashmap chainArrayList
                        positionArrayList.add(positionString);
                        // store proteinNameString as Key and positionString as Value in
                        // Hashmap positionMap
                        aa3LetterArrayList.add(residue3LetterString);
                        // store proteinNameString as Key and residue3LetterString as Value in
                        // Hashmap aa3LetterArrayList
                        aa1LetterArrayList.add(residue1LetterString);
                        // store proteinNameString as Key and residue1LetterString as Value in
                        // Hashmap aa3LetterArrayList
                    }
                }
                fileReader.close();
                fileInputStream.close();
                FileManagingService.writeCsvFile(chainArrayList, 
                        positionArrayList, aa3LetterArrayList, 
                        aa1LetterArrayList, resultsFileNameString);
                // pass parameters with results for creation of .csv file
                SeparateChains.chainSeparator(chainArrayList, 
                        positionArrayList, aa1LetterArrayList,
                        resultsFileNameString);
                // pass parameters with results for creation of FASTA file
                chainArrayList.clear();
                positionArrayList.clear();
                aa3LetterArrayList.clear();
                aa1LetterArrayList.clear();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}