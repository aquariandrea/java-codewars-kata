public class Kata {
  public static boolean feast(String beast, String dish) {
    char[] beastChar = {beast.charAt(0), beast.charAt(beast.length()-1)};
    char[] dishChar = {dish.charAt(0), dish.charAt(dish.length()-1)};
    String beastInit = new String(beastChar);
    String dishInit = new String(dishChar);
    return (beastInit.equalsIgnoreCase(dishInit)) ? true : false;
  }
}
