import java.util.function.UnaryOperator;

class Opstrings {

    public static String rot90Counter(String strng) {
      StringBuilder myBuilder = new StringBuilder();
      String[] myArray = strng.split("\n");

      for(int i = 0; i < myArray.length; i++){
        StringBuilder myTemp = new StringBuilder();
        for(String each : myArray){
          myTemp.append(each.charAt(myArray.length-1-i));
        }
        myBuilder.append(myTemp);
        if(i < myArray.length -1){
          myBuilder.append(System.lineSeparator());
        }
      }
      return myBuilder.toString();
    }

    public static String diag2Sym(String strng) {
      StringBuilder myBuilder = new StringBuilder();
      String[] myArray = strng.split("\n");

      for (int i = myArray.length-1; i >= 0; i--){
        StringBuilder myTemp = new StringBuilder();
        for(String each : myArray){
          myTemp.append(each.charAt(i));
        }
        myTemp.reverse();
        myBuilder.append(myTemp);
        if(i > 0){
          myBuilder.append(System.lineSeparator());
        }
      }
      return myBuilder.toString();
    }
    public static String selfieDiag2Counterclock(String strng) {
      String myString = strng;
      String diag2Sym = diag2Sym(strng);
      String rot90Counter = rot90Counter(strng);
      String[] myArray1 = myString.split("\n");
      String[] myArray2 = diag2Sym.split(System.lineSeparator());
      String[] myArray3 = rot90Counter.split(System.lineSeparator());
      StringBuilder myBuilder = new StringBuilder();
      for(int i = 0; i < myArray1.length; i++){
        myBuilder.append(myArray1[i]);
        myBuilder.append("|");
        myBuilder.append(myArray2[i]);
        myBuilder.append("|");
        myBuilder.append(myArray3[i]);
        if(i < myArray1.length-1){
          myBuilder.append(System.lineSeparator());
        }
      }
      return myBuilder.toString();
    }

    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
