public class RnaTranscription{
	public static String ofDna(String dna){
		dna=dna.replaceAll("G", "c").replaceAll("C", "g").replaceAll("T", "a").replaceAll("A", "u");
		return dna.toUpperCase();
	}
}	
	