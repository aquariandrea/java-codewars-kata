public class Solution{
  public static int[] rowWeights (final int[] weights){
    int countOdd = 0;
    int countEven = 0;
    for(int i = 0;i <weights.length; i++){
      if(i ==0 || i % 2 == 0){
        countEven += weights[i];
      }else{
        countOdd += weights[i];
      }
    }
      return new int[]{countEven, countOdd};
  }
}
