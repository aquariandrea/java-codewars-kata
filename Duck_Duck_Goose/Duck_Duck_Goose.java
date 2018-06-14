public class Kata {
  public static String duckDuckGoose(Player[] players, int goose) {
    String result = "";
    if(goose <= players.length){
      result = String.valueOf(players[goose-1].name);
    }else{
      result = String.valueOf(players[(goose-1)%players.length].name);
    }
    return result;
  }
}
