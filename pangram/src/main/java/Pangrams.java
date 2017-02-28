import java.util.Arrays;
public class Pangrams {
	public static Boolean isPangram(String pan){
		pan = pan.toLowerCase().replaceAll("[^A-Za-z]","");
		char[] cA = pan.toCharArray();
		Arrays.sort(cA);
		String pan2= new String(cA);
		return pan2.matches("a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z+");
	}
}
