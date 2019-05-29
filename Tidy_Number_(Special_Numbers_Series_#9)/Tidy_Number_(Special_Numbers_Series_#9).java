public class Solution{
    public static boolean tidyNumber(int number){
    	boolean result = true;
        String[] myStringArray = String.valueOf(number).split("");
        for(int i = 0; i < (myStringArray.length-1); i++){
        	int step = Integer.valueOf(myStringArray[i]) - Integer.valueOf(myStringArray[i+1]);
        	if(step <= 0){
        		result = true;
        	}else{
        		result = false;
        		break;
        	}
        }
        return result;
    }
}