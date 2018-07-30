public class Solution {
    public static String replace(final String s) {
      String result = s.replaceAll("[a|e|i|o|u|A|E|I|O|U]", "!");
        return result;
    }
}
