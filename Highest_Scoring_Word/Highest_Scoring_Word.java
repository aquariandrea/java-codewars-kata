public class Kata {

  public static String high(String s) {
    final String alphabet ="abcdefghijklmnopqrstuvwxyz";
    String[] myString = s.split(" ");

    int maxScore = 0;
    int arrayPos = 0;

    for(int i = 0; i < myString.length; i++){
      int tempScore = 0;
      for(int j = 0; j < myString[i].length();j++){
        String alph = String.valueOf(myString[i].charAt(j));
        tempScore = tempScore + alphabet.indexOf(alph);
        if (tempScore > maxScore){
          maxScore = tempScore;
          arrayPos = i;
        }
      }
    }
    return myString[arrayPos];
  }
}
