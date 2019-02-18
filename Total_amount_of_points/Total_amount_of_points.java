public class TotalPoints {
  public static int points(String[] games) {
    int scoreA = 0;
    for(int i = 0; i < games.length; i++){
    	String tempString = games[i];
    	Integer resultA = Integer.valueOf(tempString.charAt(0));
    	Integer resultB = Integer.valueOf(tempString.charAt(2));
    	if(resultA > resultB){
    		scoreA = scoreA + 3;
    	}else if(resultA.equals(resultB)){
    		scoreA = scoreA + 1;
    	}
    }
  return scoreA;
  }
}