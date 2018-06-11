public class Kata {
  public static String findNeedle(Object[] haystack) {
    int pos = 0;
    for(int i = 0; i < haystack.length; i++){
      if(haystack[i] == null){
        continue;
      }
      if(haystack[i].toString() == "needle"){
        pos = i;
      }
    }
    return ("found the needle at position " + pos);
  }
}
