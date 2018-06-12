public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
    for(int each : arr1){
      sum += each;
    }
    for(int each : arr2){
      sum += each;
    }
    return sum;
  }
}
