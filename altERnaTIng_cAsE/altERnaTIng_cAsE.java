public class StringUtils {

  public static String toAlternativeString(String string) {
    StringBuilder myBuilder = new StringBuilder();

    for(int i = 0; i < string.length(); i++){
      if(64 < string.charAt(i) && string.charAt(i) < 91){
        myBuilder.append(String.valueOf(string.charAt(i)).toLowerCase());
      }else if(96 < string.charAt(i) && string.charAt(i) < 123){
        myBuilder.append(String.valueOf(string.charAt(i)).toUpperCase());
      }else{
      myBuilder.append(string.charAt(i));
      }
    }
    return myBuilder.toString();
  }  
}
