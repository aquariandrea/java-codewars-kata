public class ReverseWords{

  public static String reverseWords(String str){
    String[] s = str.split(" ");
    StringBuilder myBuilder = new StringBuilder();
    for(int i = s.length-1; i >= 0; i--){
      myBuilder.append(s[i]);
      if(i > 0){
        myBuilder.append(" ");
      }
    }
    return myBuilder.toString();
  }
}
