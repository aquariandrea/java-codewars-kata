import java.util.Collections;
import java.util.Arrays;

public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    Collections.reverse(Arrays.asList(arr));
    return arr;
  }
}
