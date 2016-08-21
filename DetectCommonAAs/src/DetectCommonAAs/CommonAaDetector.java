package DetectCommonAAs;

import java.util.List;

public class CommonAaDetector {

    public static void detectCommonAAs(String resultsPath,
            List<String> nonRedundantAaList, String haystackDirString) {
        // class detectCommonAAs detects AAs common to all aaSeqString contained
        // as values of nonRedundantAaMap
        String commonAaString = "";
        int i = 0;
        String aaSequence1 = nonRedundantAaList.get(i);
        // get AA sequence at position i from nonRedundantAaList
        for (int j = i + 1; j < nonRedundantAaList.size(); j++) {
            // traverse through all other nonRedundantAaList elements
            String aaSequenceN = nonRedundantAaList.get(j);
            // store current element in aaSequenceN
            commonAaString =
                    aaSequence1.replaceAll("[^" + aaSequenceN + "]", "");
            // replace all substrings of aaSequenceN that are NOT found
            // in initCommonAaString with nothing and store the result
            // in finalCommonAaString. Thus, in finalCommonAaString remain
            // those characters common to ALL Strings in the List
        }

/*
         for (int i = 0; i < nonRedundantAaList.size(); i++) {
            // traverse through each nonRedundantAaList element
            String aaSequence1 = nonRedundantAaList.get(i);
            // get AA sequence at position i from nonRedundantAaList
            for (int j = i + 1; j < nonRedundantAaList.size(); j++) {
                // traverse through all remaining nonRedundantAaList elements
                String aaSequenceN = nonRedundantAaList.get(j);
                // store current element in aaSequenceN
                commonAaString =
                        aaSequence1.replaceAll("[^" + aaSequenceN + "]", "");
                // replace all substrings of aaSequenceN that are NOT found
                // in initCommonAaString with nothing and store the result
                // in finalCommonAaString. Thus, in finalCommonAaString remain
                // those characters common to ALL Strings in the List
            }
        }
*/
        
        System.out.println("commonAaString: " + commonAaString);

        FileManagingService.writeCommonAAs(resultsPath, commonAaString,
                haystackDirString);
        // pass resultsPath and commonAaString for writing of output file
    }
}
