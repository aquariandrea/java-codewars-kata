import java.util.function.UnaryOperator;
class Opstrings {

    public static String vertMirror (String strng) {
      StringBuilder StringFull = new StringBuilder();
      String[] newString = strng.split("\n");

      for (int i = 0; i < newString.length; i++){
        StringBuilder temp = new StringBuilder(newString[i]);
        temp.reverse();
        StringFull.append(temp);
        if(i < (newString.length-1)){
          StringFull.append(System.lineSeparator());
        }
      }
      return StringFull.toString();
    }

    public static String horMirror (String strng) {
      String[] newString = strng.split("\n");
      StringBuilder StringFull = new StringBuilder();

      for (int i = (newString.length - 1); i >= 0; i--){
        StringBuilder temp = new StringBuilder(newString[i]);
        StringFull.append(temp);
        if( i > 0){
          StringFull.append(System.lineSeparator());
        }
      }
      return StringFull.toString();
    }

    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
