public class CodeWars {
  public static int strCount(String str, char letter) {
    String[] myArray = str.split("");
    int result = 0;
    for(String each : myArray){
      if(each.contains(String.valueOf(letter))){
        result++;
      }
    }
    return result;
  }
}
