public class ArrayReverser{
   public static String[] reverse(String[] a){
	   	StringBuilder myBuilder = new StringBuilder();
	   	String[] myResult = new String[a.length];
	   	for(String each : a){
	   		myBuilder.append(each);
   		}
   		myBuilder.reverse();
   		for(int i = 0; i < a.length; i++){
   			StringBuilder loopBuilder = new StringBuilder();
        int counter = 0;
   			for( int j = 0; j < a[i].length(); j++){
   				loopBuilder.append(myBuilder.charAt(j));
   				counter++;
   			}
   			myResult[i] = loopBuilder.toString();
        myBuilder.delete(0, counter);
   		}
   		return myResult;
   }
}