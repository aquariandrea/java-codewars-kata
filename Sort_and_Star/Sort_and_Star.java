import java.util.Arrays;

public class SortAndStar {

  public static String twoSort(String[] s)
  {
    Arrays.sort(s);
    String firstWord = s[0];

    StringBuilder myBuilder = new StringBuilder();
    for(int i = 0; i < firstWord.length(); i++)
      {
      myBuilder.append(firstWord.charAt(i));
      if(i < firstWord.length()-1)
      {
          myBuilder.append("***");
      }
    }
    return myBuilder.toString();
  }
}
