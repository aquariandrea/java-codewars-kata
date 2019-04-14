public class Solution {
    public static String timeCorrect(String timestring) {
    	String result = "";
    	if(stringIsNull(timestring)) return null;
        if(stringIsEmpty(timestring)) return timestring;
        if(stringIsInvalid(timestring)) return null;
        Integer[] myInteger = convertToIntegerArray(timestring);
        myInteger = checkSeconds(myInteger);
        myInteger = checkMinutes(myInteger);
        myInteger = checkHours(myInteger);
        result = convertToString(myInteger);
        return result;
        }

    public static boolean stringIsNull(String string){
    	boolean check = true;
    	if(string != null) check = false;
    	return check;
    }

    public static boolean stringIsEmpty(String string){
        boolean check = true;
        if(!string.isEmpty()) check = false;
        return check;
    }

    public static boolean stringIsInvalid(String string){
    	boolean isInvalid = true;
    	String[] stringSplit = string.split(":");
        one:{
            for(String each : stringSplit){
                if(each.length() == 2){
                    for(int i = 0; i < 2;i++){
                        if(Character.isDigit(each.charAt(i))){
                            isInvalid = false;
                        }else{
                            isInvalid = true;
                            break one;
                        }
                    }
                }else{
                    isInvalid = true;
                    break;
                }
            }
        }
    	return isInvalid;
    }

    public static Integer[] convertToIntegerArray(String timestring){
    	String[] myString = timestring.split(":");
        Integer[] myInteger = new Integer[myString.length];
        for(int i=0; i < myString.length; i++){
        	myInteger[i] = Integer.valueOf(myString[i]);
        }
        return myInteger;
    }

    public static String convertToString(Integer[] integer){
    	StringBuilder myBuilder = new StringBuilder();
    	for(int i = 0; i < integer.length; i++){
    		myBuilder.append(String.format("%02d", integer[i]));
    		if(i < 2){
    			myBuilder.append(":");
    		}
    	}
    	return myBuilder.toString();
    }

    public static Integer[] checkSeconds(Integer[] myInteger){
    	if(myInteger[2] >= 60){
    		myInteger[1] = myInteger[1]+1;
    		myInteger[2] = myInteger[2] % 60;
    	}
    	return myInteger;
    }

    public static Integer[] checkMinutes(Integer[] myInteger){
    	if(myInteger[1] >= 60){
    		myInteger[0] = myInteger[0] + 1;
    		myInteger[1] = myInteger[1] % 60;
    	}
    	return myInteger;
    }

    public static Integer[] checkHours(Integer[] myInteger){
    	if(myInteger[0] == 24){
    		myInteger[0] = 00;
    	}else if(myInteger[0] > 24){
    		myInteger[0] = myInteger[0] % 24;
    	}
    	return myInteger;
    }
}