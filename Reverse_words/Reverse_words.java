public class Kata{
  public static String reverseWords(final String original)  {
    StringBuilder myBuilder = new StringBuilder();
    String[] myString = original.split(" ");
    if(myString.length == 0){
    	return original;
    }
    for (int i = myString.length-1; i >= 0; i--){
    	myBuilder.append(myString[i]);
    	if (i>0){
    		myBuilder.append(" ");
    	}
    }

    return myBuilder.reverse().toString();
  }
}