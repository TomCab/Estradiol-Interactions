package extractProteinSeqFromPLIPReport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

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
                FindE2Files.fileFinderInDir(haystackDirString, resultsPath);
                // pass haystackDirString to FindE2Files.finderInHaystack()
            }
        }
    }

    
    
    public static void writeCsvFile(ArrayList<String> chainArrayList,
            ArrayList<String> positionArrayList,
            ArrayList<String> aa3LetterArrayList,
            ArrayList<String> aa1LetterArrayList,
            String resultsFileNameString) {
        // method writeToFile writes a Comma Separated File. First column
        // is chain, second is residue number, third is 3 letter code and fourth
        // is one letter code

        Path resultsFilePath = Paths.get(resultsFileNameString);
        // create Path for File to be created
        try {
            Files.createFile(resultsFilePath);
            // if the Path does NOT already exist, create it and carry on.
            // if it does exist, report that and carry on
        } catch (Exception e) {
            System.out.println("File " + resultsFilePath
                    + "\n already exists. Nothing written.");
            System.out.println();
        }
        try {
            BufferedWriter finalResultsWriter =
                    Files.newBufferedWriter(resultsFilePath,
                            StandardCharsets.UTF_8, StandardOpenOption
                            .APPEND);
            // Creates an object finalResultsWriter of type BufferedWriter,
            // which appends to the end of a text File created at
            // finalResultsPath the following Strings, encoded in UTF-8.
            // The use of StandardCharsets.UTF_8 and not
            // simply UTF_8 ensures that the encoding is supported and a
            // IOException is thus avoided.
            for (int i=0; i < chainArrayList.size(); i++) {
                String chainKeyString = chainArrayList.get(i);
                String positionValueString = positionArrayList.get(i);
                String residue3LetterString = aa3LetterArrayList.get(i);
                String residue1LetterString = aa1LetterArrayList.get(i);
                finalResultsWriter.write(chainKeyString);
                // write current chain to 1st column of CSV file
                finalResultsWriter.write(",");
                finalResultsWriter.write(positionValueString);
                // write current position of residue in 2nd column
                finalResultsWriter.write(",");
                finalResultsWriter.write(residue3LetterString);
                // write corresponding three letter residue in 3rd4th column
                finalResultsWriter.write(",");
                finalResultsWriter.write(residue1LetterString);
                // write corresponding one letter residue in 4th column
                finalResultsWriter.newLine();
                // written CSV file contains thus three comma separated columns
            }
            finalResultsWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Results written to CSV file:");
        System.out.println(resultsFilePath);
        System.out.println();
    }



    public static void writeFastaFile(String fastaString,
            String resultsFileNameString) {

        String partialFastaNameString = StringUtils
                .substringBeforeLast(resultsFileNameString, ".csv");
        // remove .csv extension
        String fullFastaNameString = partialFastaNameString
                + ".fasta";
        // concatenate .fasta extension
        Path fastaFilePath = Paths.get(fullFastaNameString);
        // create Path for File to be written
        if (Files.notExists(fastaFilePath)) {
            // if the Path does NOT already exist, create it and carry on.
            // if it does exist, append fastaString 
            try {
                Files.createFile(fastaFilePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println(" File " + fullFastaNameString + "\n already"
                + "exists. Appending this sequence to it.");
        System.out.println();
        try {
            BufferedWriter fastaWriter =
                    Files.newBufferedWriter(fastaFilePath,
                            StandardCharsets.UTF_8, StandardOpenOption
                            .APPEND);
            fastaWriter.write(fastaString);
            fastaWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}