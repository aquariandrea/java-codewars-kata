public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
    StringBuilder myBuilder = new StringBuilder();
    for(int i = 0; i < one.length(); i++){
      myBuilder.append(String.valueOf(one.charAt(i)) + String.valueOf(two.charAt(i)) + String.valueOf(three.charAt(i)));
    }
    return myBuilder.toString();
  }
