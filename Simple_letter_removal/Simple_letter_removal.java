public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
    	String solution = "";
    	if(s.equals("") || s.isEmpty()){
    		return solution;	
    	}else{
            int j = 0;
    		while(k > 0){
    			String[] myString = s.split("");
    			if(myString.length < k){
    				k = myString.length;
    			}
                int tempInt = 65 + j;
                char tempChar = (char) tempInt;
    			String tempString = String.valueOf(tempChar);
    				for(int i = 0; i < myString.length; i++){
    					if(k > 0 && myString[i].equals(tempString)){
    						myString[i] = "";
    						k--;
    					}
    				}
    			s = String.join("", myString);
                j++;
    		}
    		solution = s;
    		return solution;
    	}
    }
}