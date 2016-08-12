package extractProteinSeqFromPLIPReport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteProteinFromPlipReport {

    public static void main(String[] args) {
        
        System.out.println("Enter path to DIRECTORY containing -E2.txt files generated as report by PLIP. \n"
                + "IMPORTANT: They MUST NOT contain empty spaces:");
        String haystackDirString = "";
        // this directory may contain other kinds of files and sub directories
        // too
        try {
            BufferedReader haystackDirRead =
                    new BufferedReader(new InputStreamReader(System.in));
            haystackDirString = haystackDirRead.readLine();
            // read user input from standard input as a buffered stream and
            // store it as a String in variable haystackPathString
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter path to DIRECTORY in which to save"
                + " results. Do NOT type the name of the file, I'll create it:");
        // Ask user for path to store file with results
        String resultsPath = "";
        try {
            BufferedReader resultsPathRead =
                    new BufferedReader(new InputStreamReader(System.in));
            resultsPath = resultsPathRead.readLine();
            // read user input from standard input as a buffered stream and
            // store it as a String in variable resultsPath
            resultsPathRead.close();
            FileManagingService
            .checkFilesAndDirectories(haystackDirString,
                    resultsPath);
            // pass user input to FileManagingService.checkFilesAndDirectories()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
