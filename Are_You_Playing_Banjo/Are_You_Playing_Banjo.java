public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return (name.charAt(0) == 82 || name.charAt(0) == 114) ? (name + " plays banjo") : (name + " does not play banjo");
  }
}
