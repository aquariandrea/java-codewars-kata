public class Sequence{

  public static int[] reverse(int n){
    int[] myIntArray = new int[n];
    for (int i = 0; i < myIntArray.length; i++){
      myIntArray[i] = n;
      n--;
    }
    return myIntArray;
  }
}
