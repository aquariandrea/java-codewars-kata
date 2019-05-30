public class Solution{
    public static String specialNumber(int number){
    	String result = new String("");
    	String[] myStringArray = String.valueOf(number).split("");
    	for(String each : myStringArray){
    		if(each.equals("0") || each.equals("1") || each.equals("2") || each.equals("3") || each.equals("4") || each.equals("5")){
    			result = "Special!!";
    		}else{
    			result = "NOT!!";
    			break;
    		}
    	}
        return result;
    }
}