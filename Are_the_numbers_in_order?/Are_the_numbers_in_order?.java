import java.util.Arrays;

public class Solution {
  public static boolean isAscOrder(int[] arr) {
  	boolean isAscOrder = true;
  	for(int i=0; i < arr.length-1; i++){
  		isAscOrder = arr[i] <= arr[i+1];
  		if(!isAscOrder){
  			break;
  		}
  	}
    return isAscOrder;
  }
}