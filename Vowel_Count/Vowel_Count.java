public class Vowels {
  public static int getCount(String str) {
    int vowelsCount = 0;
    String[] myString = str.split("");
    for(int i = 0; i < str.length(); i++){
    	if(myString[i].equalsIgnoreCase("a")){
    		vowelsCount++;
    	}else if(myString[i].equalsIgnoreCase("e")){
    		vowelsCount++;
    	}else if(myString[i].equalsIgnoreCase("i")){
    		vowelsCount++;
    	}else if(myString[i].equalsIgnoreCase("o")){
    		vowelsCount++;
    	}else if(myString[i].equalsIgnoreCase("u")){
    		vowelsCount++;
    	}
    }
    return vowelsCount;
  }
}