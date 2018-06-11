public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
    int min = args[0];
      for(int each : args){
        if(each < min){
          min = each;
        }
      }
      return min;
    }
}
