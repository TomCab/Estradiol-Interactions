package extractProteinSeqFromPLIPReport;

import java.util.ArrayList;

public class SeparateChains {



    public static void chainSeparator (ArrayList<String> chainArrayList,
            ArrayList<String> positionArrayList,
            ArrayList<String> aa1LetterArrayList,
            String resultsFileNameString) {

        ArrayList<String> seqAchainArrayList = new ArrayList<>();
        ArrayList<String> seqApositionArrayList = new ArrayList<>();
        ArrayList<String> seqAaaArrayList = new ArrayList<>();
        ArrayList<String> seqBchainArrayList = new ArrayList<>();
        ArrayList<String> seqBpositionArrayList = new ArrayList<>();
        ArrayList<String> seqBaaArrayList = new ArrayList<>();
        ArrayList<String> seqCchainArrayList = new ArrayList<>();
        ArrayList<String> seqCpositionArrayList = new ArrayList<>();
        ArrayList<String> seqCaaArrayList = new ArrayList<>();
        ArrayList<String> seqDchainArrayList = new ArrayList<>();
        ArrayList<String> seqDpositionArrayList = new ArrayList<>();
        ArrayList<String> seqDaaArrayList = new ArrayList<>();
        ArrayList<String> seqEchainArrayList = new ArrayList<>();
        ArrayList<String> seqEpositionArrayList = new ArrayList<>();
        ArrayList<String> seqEaaArrayList = new ArrayList<>();
        ArrayList<String> seqFchainArrayList = new ArrayList<>();
        ArrayList<String> seqFpositionArrayList = new ArrayList<>();
        ArrayList<String> seqFaaArrayList = new ArrayList<>();
        ArrayList<String> seqGchainArrayList = new ArrayList<>();
        ArrayList<String> seqGpositionArrayList = new ArrayList<>();
        ArrayList<String> seqGaaArrayList = new ArrayList<>();
        ArrayList<String> seqHchainArrayList = new ArrayList<>();
        ArrayList<String> seqHpositionArrayList = new ArrayList<>();
        ArrayList<String> seqHaaArrayList = new ArrayList<>();
        ArrayList<String> seqIchainArrayList = new ArrayList<>();
        ArrayList<String> seqIpositionArrayList = new ArrayList<>();
        ArrayList<String> seqIaaArrayList = new ArrayList<>();
        ArrayList<String> seqJchainArrayList = new ArrayList<>();
        ArrayList<String> seqJpositionArrayList = new ArrayList<>();
        ArrayList<String> seqJaaArrayList = new ArrayList<>();
        ArrayList<String> seqKchainArrayList = new ArrayList<>();
        ArrayList<String> seqKpositionArrayList = new ArrayList<>();
        ArrayList<String> seqKaaArrayList = new ArrayList<>();
        ArrayList<String> seqLchainArrayList = new ArrayList<>();
        ArrayList<String> seqLpositionArrayList = new ArrayList<>();
        ArrayList<String> seqLaaArrayList = new ArrayList<>();
        for (int i = 0; i < chainArrayList.size(); i++) {
            String chainIdString = chainArrayList.get(i);

            switch(chainIdString) {
            case "A": 
                seqAchainArrayList.add(chainArrayList.get(i));
                seqApositionArrayList.add(positionArrayList.get(i));
                seqAaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "B": 
                seqBchainArrayList.add(chainArrayList.get(i));
                seqBpositionArrayList.add(positionArrayList.get(i));
                seqBaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "C": 
                seqCchainArrayList.add(chainArrayList.get(i));
                seqCpositionArrayList.add(positionArrayList.get(i));
                seqCaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "D": 
                seqDchainArrayList.add(chainArrayList.get(i));
                seqDpositionArrayList.add(positionArrayList.get(i));
                seqDaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "E": 
                seqEchainArrayList.add(chainArrayList.get(i));
                seqEpositionArrayList.add(positionArrayList.get(i));
                seqEaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "F": 
                seqFchainArrayList.add(chainArrayList.get(i));
                seqFpositionArrayList.add(positionArrayList.get(i));
                seqFaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "G": 
                seqGchainArrayList.add(chainArrayList.get(i));
                seqGpositionArrayList.add(positionArrayList.get(i));
                seqGaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "H": 
                seqHchainArrayList.add(chainArrayList.get(i));
                seqHpositionArrayList.add(positionArrayList.get(i));
                seqHaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "I": 
                seqIchainArrayList.add(chainArrayList.get(i));
                seqIpositionArrayList.add(positionArrayList.get(i));
                seqIaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "J": 
                seqJchainArrayList.add(chainArrayList.get(i));
                seqJpositionArrayList.add(positionArrayList.get(i));
                seqJaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "K": 
                seqKchainArrayList.add(chainArrayList.get(i));
                seqKpositionArrayList.add(positionArrayList.get(i));
                seqKaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            case "L": 
                seqLchainArrayList.add(chainArrayList.get(i));
                seqLpositionArrayList.add(positionArrayList.get(i));
                seqLaaArrayList.add(aa1LetterArrayList.get(i));
                break;
            }
        }
        ArrayList<ArrayList<String>> megaList  = new ArrayList<>();
        // add every other ArrayList to megaList
        megaList.add(seqAchainArrayList);
        megaList.add(seqApositionArrayList);
        megaList.add(seqAaaArrayList);
        megaList.add(seqBchainArrayList);
        megaList.add(seqBpositionArrayList);
        megaList.add(seqBaaArrayList);
        megaList.add(seqCchainArrayList);
        megaList.add(seqCpositionArrayList);
        megaList.add(seqCaaArrayList);
        megaList.add(seqDchainArrayList);
        megaList.add(seqDpositionArrayList);
        megaList.add(seqDaaArrayList);
        megaList.add(seqEchainArrayList);
        megaList.add(seqEpositionArrayList);
        megaList.add(seqEaaArrayList);
        megaList.add(seqFchainArrayList);
        megaList.add(seqFpositionArrayList);
        megaList.add(seqFaaArrayList);
        megaList.add(seqGchainArrayList);
        megaList.add(seqGpositionArrayList);
        megaList.add(seqGaaArrayList);
        megaList.add(seqHchainArrayList);
        megaList.add(seqHpositionArrayList);
        megaList.add(seqHaaArrayList);
        megaList.add(seqIchainArrayList);
        megaList.add(seqIpositionArrayList);
        megaList.add(seqIaaArrayList);
        megaList.add(seqJchainArrayList);
        megaList.add(seqJpositionArrayList);
        megaList.add(seqJaaArrayList);
        megaList.add(seqKchainArrayList);
        megaList.add(seqKpositionArrayList);
        megaList.add(seqKaaArrayList);
        megaList.add(seqLchainArrayList);
        megaList.add(seqLpositionArrayList);
        megaList.add(seqLaaArrayList);
        ArrayList<ArrayList<String>> trimmedMegaList = new ArrayList<>();
        megaList.forEach((v) -> {
            // eliminate empty ArrayLists in order to pass them to
            // class FastaCreator
            if(!v.isEmpty()) {
                trimmedMegaList.add(v);
            }
        });
         System.out.println("trimmedMegaList: " + trimmedMegaList);
        FastaCreator.preprocessChains(trimmedMegaList, resultsFileNameString);
        // pass trimmedMegaList to FastaCreator for further processing
    }
}
