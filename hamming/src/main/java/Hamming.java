public class Hamming{
	public static int compute(String x, String y) throws IllegalArgumentException{
		if (x.length()!=y.length()){
			throw new IllegalArgumentException();
		}
		if (x.compareTo(y)==0)
			return 0;
		int counter=0;
		for (int i=0;i<x.length();i++)
			if (x.charAt(i) != y.charAt(i))
				counter++;
		return counter;
	}
}
