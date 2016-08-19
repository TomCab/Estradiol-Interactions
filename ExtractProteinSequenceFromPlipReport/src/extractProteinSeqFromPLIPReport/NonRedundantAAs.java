package extractProteinSeqFromPLIPReport;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class NonRedundantAAs {

    private static String nonRedundantAaString;
    private static SortedSet<String> aaSet = new TreeSet<>();


    public static void eliminateRedundantAAs(String proteinIdString,
            String chainIdString, HashMap<Integer, String> chainXxMap,
            String resultsFileNameString) {

        aaSet.clear();
        // reset aaSet to empty
        chainXxMap.forEach((k, v) -> {
            // add all AAs from chainXxMap to aaSet. Since the SortedSet
            // interface doesn't store redundant entries, any repeated AAs are
            // thus automagically eliminated.
            aaSet.add(v);
        });
        nonRedundantAaString = "";
        // reset nonRedundantAaString to empty
        aaSet.forEach((e) -> {
            // append each entry of aaSet to nonRedundantAaString
            nonRedundantAaString = nonRedundantAaString + e;
        });
        FileManagingService.writeInteractingAAs(proteinIdString, chainIdString,
                nonRedundantAaString, resultsFileNameString);
        // call FileManagingService.writeInteractingAAs and pass parameters
    }
}
