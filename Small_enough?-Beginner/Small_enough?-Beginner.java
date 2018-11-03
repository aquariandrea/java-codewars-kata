public class Kata{
  public static boolean smallEnough(int[] a, int limit){
  	boolean result = true;
  	for(int each : a){
  		if(each > limit){
  			result = false;
  			break;
  		}
  	}
    return result;
  }
}