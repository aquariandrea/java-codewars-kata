public class NoBoring {
  public static int noBoringZeros(int n) {
    if(n == 0){
      return n;
    }
      while(n%10 == 0){
        n = n/10;
      }
      return n;
  }
}
