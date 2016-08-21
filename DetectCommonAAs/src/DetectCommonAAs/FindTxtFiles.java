package DetectCommonAAs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FindTxtFiles {

    public static void fileFinderInDir(String haystackDirString,
            String resultsPath) {
        // finderInHaystack() finds files containing the String
        // "-non-redundant.txt" in its name in the directory to which
        // haystackDirString points and passes them on for further
        // processing

        List<String> filesList = new ArrayList<>();
        // create an array list in which to hold all .score Files found
        Path startPath = Paths.get(haystackDirString);
        // create a Path from haystackDirString
        int maxDepth = 1;
        // maximum directory depth to search. No need to go further, otherwise
        // we risk mixing up results.
        try {
            Files.find(startPath, maxDepth,
                    (filePath, attr) -> String.valueOf(filePath)
                            .contains("-non-redundant.txt"))
                    // finds "-non-redundant.txt" in string contained by
                    // filePath
                    .sorted()
                    .forEach(filePath -> filesList.add(filePath.toString()));
            // sorts and adds to List filesList the path of every File
            // in current directory containing String "-E2.txt" in its name

            
             StringFetcher.fetchStringFromFile(filesList, resultsPath, haystackDirString);
             // pass to StringFetcher.fetcher() the List of all paths
             

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
