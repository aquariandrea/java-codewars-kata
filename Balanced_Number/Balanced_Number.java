public class Solution
{
    public static String balancedNum(long number){
    	String isBalanced = "Balanced";
    	String isNotBalanced = "Not Balanced";
    	String result = "";
    	if(isNull(number)){
    		result = isBalanced;
    	}else if(isOne(number)){
    		result = isBalanced;
    	}else if(isTwo(number)){
    		result = isBalanced;
    	}else{
    		if(findBalance(number)){
    			result = isBalanced;
    		}else{
    			result = isNotBalanced;
    		}
    	}
        return result;
    }

    public static boolean isNull(long number){
    	return String.valueOf(number) == null;
    }

    public static boolean isOne(long number){
    	return String.valueOf(number).length() == 1;
    }

    public static boolean isTwo(long number){
    	return String.valueOf(number).length() == 2;
    }

    public static boolean findBalance(long number){
    	boolean result = false;
    	String numberString = String.valueOf(number);
    	int middle = numberString.length()/2;
    	int intLeft = 0;
    	int intRight = 0;
    	if(isEven(numberString)){
    		intLeft = returnLeftSum(numberString, (middle-1));
    		intRight = returnRightSum(numberString, middle);
    		if(intLeft == intRight){
    			result = true;
    		}else{
    			result = false;
    		}
    	}else{
    		intLeft = returnLeftSum(numberString, (middle));
    		intRight = returnRightSum(numberString, (middle));
    		if(intLeft == intRight){
    			result = true;
    		}else{
    			result = false;
    		}
    	}
    	return result;
    }

    public static int returnLeftSum(String numberString, int index){
    	int sum = 0;
    	for(int i = 0; i < index; i++){
    		int temp = Integer.valueOf(numberString.charAt(i));
    		sum = sum + temp;
    	}
    	return sum;
    }

    public static int returnRightSum(String numberString, int index){
    	int sum = 0;
    	for(int i = numberString.length()-1; i > index; i--){
    		int temp = Integer.valueOf(numberString.charAt(i));
    		sum = sum + temp;
    	}
    	return sum;
    }

    public static boolean isEven(String numberString){
    	return numberString.length() %2 == 0;
    }
}