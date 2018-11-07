public class Kata {
  public static String stringMerge(String s1, String s2, char letter) {
  	int indexS1 = s1.indexOf(letter);
  	int indexS2 = s2.indexOf(letter);
    String newS1 = s1.substring(0, indexS1);
    String newS2 = s2.substring(indexS2, s2.length());
    return newS1 + newS2;
  }
}