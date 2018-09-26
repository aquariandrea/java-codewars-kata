public class Accumul {
    public static String accum(String s) {
    	StringBuilder myBuilder = new StringBuilder();
    	for(int i = 0; i < s.length(); i++){
    		for(int j = 0; j <= i; j++){
    			if(j==0){
    				myBuilder.append(Character.toUpperCase(s.charAt(i)));	
    			}else{
    				myBuilder.append(Character.toLowerCase(s.charAt(i)));
    			}
    			
    		}
    		if(i < s.length()-1){
    			myBuilder.append("-");
    		}
    	}
    	return myBuilder.toString();
    }
}