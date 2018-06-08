import java.lang.StringBuilder;

class Solution{

  static String toCamelCase(String s){
    StringBuilder myBuilder = new StringBuilder();
    String[] myArray = s.split("-|_");

    myBuilder.append(myArray[0]);

    for(int i = 1; i < myArray.length; i++){
      StringBuilder myTemp = new StringBuilder();
      for(int j = 0; j < myArray[i].length(); j++){
        if(j == 0){
          String firstChar = String.valueOf(myArray[i].charAt(j));
          String capitalChar = firstChar.toUpperCase();
          myTemp.append(capitalChar);
        }else{
          myTemp.append(myArray[i].charAt(j));
        }
      }
      myBuilder.append(myTemp);
    }

    return myBuilder.toString();
  }
}
