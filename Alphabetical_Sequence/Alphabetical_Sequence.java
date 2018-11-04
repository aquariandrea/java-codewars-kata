import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution {
    public static String alphaSeq(String s){
        String[] myString = sortedString(toArray(s));
        StringBuilder myBuilder = new StringBuilder();
        for(int i = 0; i < myString.length; i++){
            int loops = charToInt(myString[i]);
            for(int j = 0; j < loops; j++){
                if(j == 0){
                    myBuilder.append(myString[i].toUpperCase());
                }else{
                    myBuilder.append(myString[i]);
                }
            }
            if(i < myString.length-1){
                myBuilder.append(",");
            }
        }
        return myBuilder.toString();
    }

    public static String[] toArray(String s){
        return s.split("");
    }

    public static String[] sortedString(String[] s){
    	for (int i = 0; i < s.length; i++){
    		s[i] = s[i].toLowerCase();
    	}
        Arrays.sort(s);
        return s;
    }
    public static int charToInt(String s){
    	char charAt = s.charAt(0);
    	int alphabetPosition = (int) charAt - 96;
    	return alphabetPosition;
    }
}