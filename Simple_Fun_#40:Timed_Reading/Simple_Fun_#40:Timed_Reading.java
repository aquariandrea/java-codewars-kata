public class Kata {
    public static int timedReading(final int maxLength, final String text) {
    	String wordsOnly = text.replaceAll("[^a-zA-Z ]","");
        String[] myStringArray = wordsOnly.split(" ");
        if(myStringArray.length == 1) return 0;
        int result = 0;
        for (int i = 0; i < myStringArray.length; i++){
        	if(myStringArray[i].length() <= maxLength){
        		result ++;
        	}
        }
        return result;
    }
}