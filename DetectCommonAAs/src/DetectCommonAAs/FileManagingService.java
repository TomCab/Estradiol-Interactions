package DetectCommonAAs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.apache.commons.lang3.StringUtils;

public class FileManagingService {

    public static void checkFilesAndDirectories(String haystackDirString,
            String resultsPath) {
        // method checks paths provided by user

        File haystackDirStringFile = new File(haystackDirString);
        // create object haystackDirStringFiles of type File with path
        // to which haystackDirString points
        if (!(haystackDirStringFile.exists() && haystackDirStringFile.canRead()
                && haystackDirStringFile.isDirectory())) {
            System.out.println("Path you provided does not exist, cannot be"
                    + " read or is not a directory. Please check and try again.");
            // inform user in case the path provided is inviable
        } else {
            Path pathToOutputFile = Paths.get(resultsPath);
            // Creates Object pathToOutputFile of type Path from user input
            if (!(Files.exists(pathToOutputFile)
                    && Files.isReadable(pathToOutputFile)
                    && Files.isDirectory(pathToOutputFile))) {
                // in case pathToOutputFile does NOT exist,
                System.out.println(" Output path does not exist, or cannot be"
                        + " read. Please check and try again.");
            } else {
                FindTxtFiles.fileFinderInDir(haystackDirString, resultsPath);
                // pass haystackDirString to FindTxtFiles.finderInHaystack()
            }
        }
    }


    public static void writeCommonAAs(String resultsPath, String commonAaString,
            String haystackDirString) {
        // method writes AAs common to all tested strings
        
        String inputDirString = StringUtils
                .substringAfterLast(haystackDirString, File.separator);
        // store the name of input directory in inputDirString. If you've been
        // working with some measure of discipline, it should be the Pfam-ID of
        // the protein family you're wirking with here
        String fullOutputNameString = resultsPath + File.separator
                + inputDirString + "-common-AAs.txt";
        // create full name for file to be written
        Path commonAAsFilePath = Paths.get(fullOutputNameString);
        // create the Path for the file to be written
        try {
            Files.createFile(commonAAsFilePath);
        } catch (Exception e) {
            System.out.println("File " + commonAAsFilePath
                    + "\n already exists. Nothing written.");
            System.out.println();
        }
        try {
            BufferedWriter commonAAsWriter =
                    Files.newBufferedWriter(commonAAsFilePath,
                            StandardCharsets.UTF_8, StandardOpenOption.WRITE);
            commonAAsWriter.write(commonAaString);
            commonAAsWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Detection of common aminoacids finished.");
    }

}