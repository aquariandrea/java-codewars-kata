import java.util.function.UnaryOperator;

class Opstrings1 {

    public static String rot(String strng) {
        StringBuilder myBuilder = new StringBuilder();
        String[] newString = strng.split("\n");

        for (int i = (newString.length -1); i >= 0; i--){
          StringBuilder myTemp = new StringBuilder(newString[i]);
          myTemp.reverse();
          myBuilder.append(myTemp);
          if(i > 0){
            myBuilder.append(System.lineSeparator());
          }
        }
        return myBuilder.toString();
    }
    public static String selfieAndRot(String strng) {
        StringBuilder myBuilder = new StringBuilder();
        String[] newString = strng.split("\n");

        for (int i = 0; i < newString.length; i++){
          StringBuilder myTemp = new StringBuilder(newString[i]);
          for(int j = 0; j < newString[i].length(); j++){
            myTemp.append(".");
          }
          myBuilder.append(myTemp);
          if(i < newString.length-1){
            myBuilder.append(System.lineSeparator());
          }
        }
        StringBuilder reverseBuilder = new StringBuilder(myBuilder);
        reverseBuilder.reverse();
        myBuilder.append(System.lineSeparator());
        myBuilder.append(reverseBuilder);
        return myBuilder.toString();
    }
    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
