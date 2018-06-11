public class RemoveChars {
    public static String remove(String str) {
    StringBuilder myBuilder = new StringBuilder(str);

    myBuilder.deleteCharAt(str.length()-1);
    myBuilder.deleteCharAt(0);

    return myBuilder.toString();
    }
}
