public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
    int[] result = new int[n];
    for(int i = 0; i < n; i++){
      result[i] = n-(n-i-1);
    }
    return result;
  }
}
