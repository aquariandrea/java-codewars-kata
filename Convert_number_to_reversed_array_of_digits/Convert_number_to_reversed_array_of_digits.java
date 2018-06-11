public class Kata {
  public static int[] digitize(long n) {
    String[] string = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
    int[] myArray = new int[string.length];
    for (int i = 0; i < string.length; i++) {
      myArray[i] = Integer.parseInt(string[i]);
    }
    return myArray;
  }
}
