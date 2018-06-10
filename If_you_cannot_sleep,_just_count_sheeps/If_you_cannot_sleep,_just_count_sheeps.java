class Kata {
  public static String countingSheep(int num) {
    final String sheep = " sheep...";
    String result = "";
    for(int i = 1; i <= num; i++){
      result = result + i + sheep;
    }
    return result;
  }
}
