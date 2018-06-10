public class Positive{

  public static int sum(int[] arr){
    int result = 0;
    for(int each : arr){
      if(each > 0){
        result = result + each;
      }
    }
    return result;
  }
}
