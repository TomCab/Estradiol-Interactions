package DetectCommonAAs;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
            /*    
                FindE2Files.fileFinderInDir(haystackDirString, resultsPath);
                // pass haystackDirString to FindE2Files.finderInHaystack()
            */
            }
        }
    }

/*
    public static void writeCsvFile(ArrayList<String> chainArrayList,
            ArrayList<String> positionArrayList,
            ArrayList<String> aa3LetterArrayList,
            ArrayList<String> aa1LetterArrayList,
            String resultsFileNameString) {
        // method writeToFile writes a Comma Separated File. First column
        // is chain, second is residue number, third is 3 letter code and fourth
        // is one letter code

        Path csvFilePath = Paths.get(resultsFileNameString);
        // create Path for File to be created
        try {
            Files.createFile(csvFilePath);
            // if the Path does NOT already exist, create it and carry on.
            // if it does exist, report that and carry on
        } catch (Exception e) {
            System.out.println("File " + csvFilePath
                    + "\n already exists. Nothing written.");
            System.out.println();
        }
        try {
            BufferedWriter csvResultsWriter =
                    Files.newBufferedWriter(csvFilePath, StandardCharsets.UTF_8,
                            StandardOpenOption.APPEND);
            // Creates an object finalResultsWriter of type BufferedWriter,
            // which appends to the end of a text File created at
            // finalResultsPath the following Strings, encoded in UTF-8.
            // The use of StandardCharsets.UTF_8 and not
            // simply UTF_8 ensures that the encoding is supported and a
            // IOException is thus avoided.
            for (int i = 0; i < chainArrayList.size(); i++) {
                String chainKeyString = chainArrayList.get(i);
                String positionValueString = positionArrayList.get(i);
                String residue3LetterString = aa3LetterArrayList.get(i);
                String residue1LetterString = aa1LetterArrayList.get(i);
                csvResultsWriter.write(chainKeyString);
                // write current chain in 1st column of CSV file
                csvResultsWriter.write(",");
                csvResultsWriter.write(positionValueString);
                // write current position of residue in 2nd column
                csvResultsWriter.write(",");
                csvResultsWriter.write(residue3LetterString);
                // write corresponding three letter residue in 3rd column
                csvResultsWriter.write(",");
                csvResultsWriter.write(residue1LetterString);
                // write corresponding one letter residue in 4th column
                csvResultsWriter.newLine();
                // written CSV file contains thus three comma separated columns
            }
            csvResultsWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Results written to CSV file:");
        System.out.println(csvFilePath);
        System.out.println();
    }
*/
    
/*
    public static void writeFastaFile(String fastaString,
            String resultsFileNameString) {

        String partialFastaNameString =
                StringUtils.substringBeforeLast(resultsFileNameString, ".csv");
        // remove .csv extension
        String fullFastaNameString = partialFastaNameString + ".fasta";
        // concatenate .fasta extension
        Path fastaFilePath = Paths.get(fullFastaNameString);
        // create Path for File to be written

        if (Files.exists(fastaFilePath)) {
            // if Path already exist, report this and inform that current
            // sequence is being appende to it
            System.out.println();
            System.out.println(" File " + fullFastaNameString + "\n already"
                    + " exists. Appending this sequence to it.");
            System.out.println();
        }
        if (Files.notExists(fastaFilePath)) {
            // if the Path does NOT already exist, create it and carry on.
            try {
                Files.createFile(fastaFilePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            BufferedWriter fastaWriter = Files.newBufferedWriter(fastaFilePath,
                    StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            fastaWriter.write(fastaString);
            fastaWriter.close();
            // append fastaString to File at fastaFilePath
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/
    
/*
    public static void writeInteractingAAs(String proteinIdString,
            String chainIdString, String nonRedundantAaString,
            String resultsFileNameString) {

        String partialAaTxtNameString = StringUtils
                .substringBeforeLast(resultsFileNameString, File.separator);
        // remove everything after last File.separator ("/" in Linux)
        String fullAaTxtNameString = partialAaTxtNameString + File.separator
                + proteinIdString + "-" + chainIdString + ".txt";
        // create full name for file to be written
        Path TxtFilePath = Paths.get(fullAaTxtNameString);
        // create the PAth for the file to be written
        try {
            Files.createFile(TxtFilePath);
        } catch (Exception e) {
            System.out.println("File " + TxtFilePath
                    + "\n already exists. Nothing written.");
            System.out.println();
        }
        try {
            BufferedWriter txtWriter = Files.newBufferedWriter(TxtFilePath,
                    StandardCharsets.UTF_8, StandardOpenOption.WRITE);
            txtWriter.write(nonRedundantAaString);
            txtWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
*/    
}