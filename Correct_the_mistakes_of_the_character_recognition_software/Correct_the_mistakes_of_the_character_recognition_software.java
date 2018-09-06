public class Correct {
  public static String correct(String string) {
    return string.replaceAll("1", "I").replaceAll("5", "S").replaceAll("0", "O");
  }
}
