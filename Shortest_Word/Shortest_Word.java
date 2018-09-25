import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        String[] myString = s.split(" ");
        String result = myString[0];
        for(int i = 1; i < myString.length; i++){
        	if(myString[i].length() < result.length()){
        		result = myString[i];
        	}
        }
       	return result.length();
    }
}