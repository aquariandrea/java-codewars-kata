import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    StringBuilder myBuilder = new StringBuilder();

    for(String each : words){
      myBuilder.append(each + " ");
    }
    return myBuilder.toString().trim();
  }
}
