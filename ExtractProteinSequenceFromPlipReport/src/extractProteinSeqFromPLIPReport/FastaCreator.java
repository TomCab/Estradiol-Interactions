package extractProteinSeqFromPLIPReport;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class FastaCreator {

    private static String interactingAAString;


    public static void preprocessChains(
            ArrayList<ArrayList<String>> trimmedMegaList,
            String resultsFileNameString) {

        HashMap<Integer, String> chain0Map = new HashMap<>();
        HashMap<Integer, String> chain1Map = new HashMap<>();
        HashMap<Integer, String> chain2Map = new HashMap<>();
        HashMap<Integer, String> chain3Map = new HashMap<>();
        HashMap<Integer, String> chain4Map = new HashMap<>();
        HashMap<Integer, String> chain5Map = new HashMap<>();
        HashMap<Integer, String> chain6Map = new HashMap<>();
        HashMap<Integer, String> chain7Map = new HashMap<>();
        HashMap<Integer, String> chain8Map = new HashMap<>();
        HashMap<Integer, String> chain9Map = new HashMap<>();
        HashMap<Integer, String> chain10Map = new HashMap<>();
        HashMap<Integer, String> chain11Map = new HashMap<>();
        double threshold = 0;
        String aaString = "";
        int posInt = 0;
        String chain0IdString = "";
        String chain1IdString = "";
        String chain2IdString = "";
        String chain3IdString = "";
        String chain4IdString = "";
        String chain5IdString = "";
        String chain6IdString = "";
        String chain7IdString = "";
        String chain8IdString = "";
        String chain9IdString = "";
        String chain10IdString = "";
        String chain11IdString = "";

        for (int i = 0; i < trimmedMegaList.size(); i++) {
            threshold = i / 3;
            // divided by 3 because trimmedMegaList is composed of 3 lists, all
            // of them with equal length
            if (threshold < 1) {
                // this means the 0th Chain
                chain0IdString = trimmedMegaList.get(0).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(0).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(1).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(2).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain0Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                    // If there are duplicated <posInt, aaString> entries, they
                    // are simply overwritten. This way redundant entries are
                    // automagically eliminated
                }
            }
            if (threshold >= 1 && threshold < 2) {
                // this means the 1st Chain
                chain1IdString = trimmedMegaList.get(3).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(3).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(4).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(5).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain1Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 2 && threshold < 3) {
                // this means the 2nd Chain
                chain2IdString = trimmedMegaList.get(6).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(6).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(7).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(8).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain2Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 3 && threshold < 4) {
                // this means the 3rd Chain
                chain3IdString = trimmedMegaList.get(9).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(9).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(10).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(11).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain3Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 4 && threshold < 5) {
                // this means the 4th Chain
                chain4IdString = trimmedMegaList.get(12).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(12).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(13).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(14).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain4Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 5 && threshold < 6) {
                // this means the 5th Chain
                chain5IdString = trimmedMegaList.get(15).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(15).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(16).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(17).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain5Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 6 && threshold < 7) {
                // this means the 6th Chain
                chain6IdString = trimmedMegaList.get(18).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(18).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(19).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(20).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain6Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 7 && threshold < 8) {
                // this means the 7th Chain
                chain7IdString = trimmedMegaList.get(21).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(21).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(22).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(23).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain7Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 8 && threshold < 9) {
                // this means the 8th Chain
                chain8IdString = trimmedMegaList.get(24).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(24).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(25).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(26).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain8Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 9 && threshold < 10) {
                // this means the 10th Chain
                chain9IdString = trimmedMegaList.get(27).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(27).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(28).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(29).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain9Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 10 && threshold < 11) {
                // this means the 11th Chain
                chain10IdString = trimmedMegaList.get(30).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(30).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(31).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(32).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain10Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
            if (threshold >= 11 && threshold < 12) {
                // this means the 12th Chain
                chain11IdString = trimmedMegaList.get(33).get(0);
                // Store the chain ID
                for (int j = 0; j < trimmedMegaList.get(33).size(); j++) {
                    // for each entry in megaList
                    posInt = Integer.parseInt(trimmedMegaList.get(34).get(j));
                    // fetch current position from ArrayList of positions
                    aaString = trimmedMegaList.get(35).get(j);
                    // fetch current AA from ArrayList of AAs
                    chain11Map.put(posInt, aaString);
                    // store current position and AA in HashMap
                }
            }
        }
        if (!chain0Map.isEmpty()) {
            createFastaStrings(chain0IdString, chain0Map,
                    resultsFileNameString);
        }
        if (!chain1Map.isEmpty()) {
            createFastaStrings(chain1IdString, chain1Map,
                    resultsFileNameString);
        }
        if (!chain2Map.isEmpty()) {
            createFastaStrings(chain2IdString, chain2Map,
                    resultsFileNameString);
        }
        if (!chain3Map.isEmpty()) {
            createFastaStrings(chain3IdString, chain3Map,
                    resultsFileNameString);
        }
        if (!chain4Map.isEmpty()) {
            createFastaStrings(chain4IdString, chain4Map,
                    resultsFileNameString);
        }
        if (!chain5Map.isEmpty()) {
            createFastaStrings(chain5IdString, chain5Map,
                    resultsFileNameString);
        }
        if (!chain6Map.isEmpty()) {
            createFastaStrings(chain6IdString, chain6Map,
                    resultsFileNameString);
        }
        if (!chain7Map.isEmpty()) {
            createFastaStrings(chain7IdString, chain7Map,
                    resultsFileNameString);
        }
        if (!chain8Map.isEmpty()) {
            createFastaStrings(chain8IdString, chain8Map,
                    resultsFileNameString);
        }
        if (!chain9Map.isEmpty()) {
            createFastaStrings(chain9IdString, chain9Map,
                    resultsFileNameString);
        }
        if (!chain10Map.isEmpty()) {
            createFastaStrings(chain10IdString, chain10Map,
                    resultsFileNameString);
        }
        if (!chain11Map.isEmpty()) {
            createFastaStrings(chain11IdString, chain11Map,
                    resultsFileNameString);
        }
    }


    public static void createFastaStrings(String chainIdString,
            HashMap<Integer, String> chainXxMap, String resultsFileNameString) {
        // this method creates the Aminoacid String in FASTA format

        String proteinIdString =
                StringUtils.substringBefore(StringUtils.substringAfterLast(
                        resultsFileNameString, File.separator), ".");
        // extract proteinID from fastaFilePath. It is located between the last
        // File.separator and before the "."
        String fastaString = ">" + proteinIdString + ":" + chainIdString + "\n";
        // create FASTA header for the sequence
        ArrayList<Integer> aaNrArrayList = new ArrayList<>();
        interactingAAString = "";
        // reset interactingAAString to empty
        chainXxMap.forEach((k, v) -> {
            // pull each AA position in the chain from chainXxMap and store them
            // in aaNrArrayList
            aaNrArrayList.add(k);
            interactingAAString = interactingAAString + v;
        });
        NonRedundantAAs.eliminateRedundantAAs(proteinIdString, chainIdString,
                chainXxMap, resultsFileNameString);
        // pass information to NonRedundantAAs.eliminateRedundantAAs() for
        // elimination of redundant AAs in each Chain and creation of
        // files to be further refined looking for common AAs in different
        // proteins
        Collections.sort(aaNrArrayList);
        // sort aaNrArrayList in natural order
        int lastPositionInt = aaNrArrayList.size() - 1;
        // calculate the last position in aaNrArrayList
        int seqLengthInt = aaNrArrayList.get(lastPositionInt);
        // get the entry at lastPositionInt in aaNrArrayList. It's the largest
        // RESNR of all residues that interact with E2
        String[] aaPositionsArray = new String[seqLengthInt];
        // generate aaPositionsArray with length equal to the RESNR of the
        // last AA contained in aaNrArrayList
        Arrays.fill(aaPositionsArray, "X");
        // fill all positions in aaPositionsArray with "X": FASTA code for
        // arbitrary aminoacid in the sequence
        chainXxMap.forEach((k, v) -> {
            // overwrite index k of aaPositionsArray with corresponding
            // aminoacid v
            aaPositionsArray[k - 1] = v;
        });
        String aASeqString = "";
        for (int m = 0; m < aaPositionsArray.length; m++) {
            // traverse through aaPositionsArray, concatenating each element
            // to fastaString
            aASeqString = aASeqString + aaPositionsArray[m];
        }
        String trimmedAaSeqString = StringUtils.stripStart(aASeqString, "X");
        // remove all "X" before first interacting residue and store trimmed
        // string in trimmedAaSeqString
        fastaString = fastaString + trimmedAaSeqString + "\n";
        // concatenate fastaString with aASeqString and add
        // a line break to the end
        FileManagingService.writeFastaFile(fastaString, resultsFileNameString);
        // pass sequence to be written to FASTA file
    }
}
