public class Kata {
    public static String reverseLetter(final String str) {
        StringBuilder myBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
        	char a = str.charAt(i);
        	if (64 < a && a < 91){
        		myBuilder.append(a);
        	}else if(96 < a && a < 123){
        		myBuilder.append(a);
        	}
        }
    	return myBuilder.reverse().toString();
    }
}