public class CC {
  public static int charCount(String str, char c) {
    int initialLength = str.length();
    int finalLength = str.toLowerCase().replace(Character.toString(c).toLowerCase(), "").length();
    return initialLength - finalLength;
  }
}