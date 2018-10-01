public class Repeater{
	public static String repeat(String string,long n){
  		StringBuilder myBuilder = new StringBuilder();
  		for(long i = 0; i < n; i++){
  			myBuilder.append(string);
  		}
  	return myBuilder.toString();
  }
}