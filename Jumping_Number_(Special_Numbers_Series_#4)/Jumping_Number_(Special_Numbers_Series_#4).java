public class Solution{
	public static String jumpingNumber(int number){
		String result = new String();
		if(number < 10){
			result = "Jumping!!";
		}else{ 
			String[] myStringArray = String.valueOf(number).split("");
			for(int i = 0; i < myStringArray.length -1; i++){
				int difference = Math.abs(Integer.valueOf(myStringArray[i]) - Integer.valueOf(myStringArray[i+1]));
				if (difference != 1 && difference != 0){
					result = "Not!!";
					break;
				}else{
					result = "Jumping!!";
				}
			}
		}
		return result;
    }
}