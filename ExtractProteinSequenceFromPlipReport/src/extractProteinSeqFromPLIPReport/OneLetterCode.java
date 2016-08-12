package extractProteinSeqFromPLIPReport;

import java.util.HashMap;
import java.util.Map;

public class OneLetterCode {
    public final static Map<String, String> AMINOACIDS = new HashMap<>();
    // contains one-letter codes of Aaminoacids
    
    static {
        AMINOACIDS.put("ALA", "A"); // Alanine
        AMINOACIDS.put("ARG", "R"); // Arginine
        AMINOACIDS.put("ASN", "N"); // Asparagine
        AMINOACIDS.put("ASP", "D"); // Aspartic Acid
        AMINOACIDS.put("CYS", "C"); // Cysteine
        AMINOACIDS.put("GLU", "E"); // Glutamic Acid
        AMINOACIDS.put("GLN", "Q"); // Glutamine
        AMINOACIDS.put("GLY", "G"); // Glycine
        AMINOACIDS.put("HIS", "H"); // Histidine
        AMINOACIDS.put("ILE", "I"); // Isoleucine
        AMINOACIDS.put("LEU", "L"); // Leucine
        AMINOACIDS.put("LYS", "K"); // Lysine
        AMINOACIDS.put("MET", "M"); // Methionine
        AMINOACIDS.put("PHE", "F"); // Phenylalanine
        AMINOACIDS.put("PRO", "P"); // Proline
        AMINOACIDS.put("SER", "S"); // Serine
        AMINOACIDS.put("THR", "T"); // Threonine
        AMINOACIDS.put("TRP", "W"); // Tryptophan
        AMINOACIDS.put("TYR", "Y"); // Tyrosine
        AMINOACIDS.put("VAL", "V"); // Valine
        AMINOACIDS.put("SEC", "U"); // Selenocysteine - some archaea, bacteria
                                     // and some eukaryotes
        AMINOACIDS.put("PYL", "O"); // Pyrrolysine - some archaea and bacteria
    }
}
