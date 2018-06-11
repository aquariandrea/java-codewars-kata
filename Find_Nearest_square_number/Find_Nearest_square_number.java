public class CodeWarsMath {
  public static int nearestSq(final int n){
   int roundUpSqrt = (int) (Math.sqrt(n)+1);
   int roundDownSqrt = (int) Math.sqrt(n);

   int UpRoot = roundUpSqrt * roundUpSqrt;
   int DownRoot = roundDownSqrt * roundDownSqrt;

   return (UpRoot-n > n-DownRoot) ? DownRoot : UpRoot;
  }
}
