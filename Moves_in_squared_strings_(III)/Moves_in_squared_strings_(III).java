import java.util.function.UnaryOperator;

class Opstrings {

    public static String diag1Sym(String strng) {
      StringBuilder myBuilder = new StringBuilder();
      String[] myString = strng.split("\n");

      for (int i = 0; i < myString.length; i++){
        StringBuilder myTemp = new StringBuilder();
        for(String each : myString){
          myTemp.append(each.charAt(i));
        }
        myBuilder.append(myTemp);
        if(i < myString.length-1){
          myBuilder.append(System.lineSeparator());
        }
      }
      return myBuilder.toString();
    }
    public static String rot90Clock(String strng) {
      String diag1Sym = diag1Sym(strng);
      String[] myArrayString = diag1Sym.split(System.lineSeparator());
      StringBuilder myBuilder = new StringBuilder();

      for(int i =0; i < myArrayString.length; i++){
        StringBuilder myTemp = new StringBuilder(myArrayString[i]);
        myTemp.reverse();
        myBuilder.append(myTemp);
        if(i < myArrayString.length -1){
          myBuilder.append(System.lineSeparator());
        }
      }
      return myBuilder.toString();
    }

    public static String selfieAndDiag1(String strng) {
        String diag1Sym = diag1Sym(strng);
        String[] myArray1 = strng.split("\n");
        String[] myArray2 = diag1Sym.split(System.lineSeparator());
        StringBuilder myBuilder = new StringBuilder();

        for (int i = 0; i < myArray1.length; i++){
          myBuilder.append(myArray1[i]);
          myBuilder.append("|");
          myBuilder.append(myArray2[i]);
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
