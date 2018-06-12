public class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {

    return (toRepeat instanceof String) ? new String(new char[n]).replace("\0", toRepeat.toString()) : "Not a string";
  }
}
