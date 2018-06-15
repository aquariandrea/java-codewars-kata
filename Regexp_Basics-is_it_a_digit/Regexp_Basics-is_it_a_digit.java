public class StringUtils {

  public static boolean isDigit(String s) {
    if(s == null | s.length() == 0 | s.length() > 1) return false;
    if (!Character.isDigit(s.charAt(0))) return false;
    return true;
  }
}
