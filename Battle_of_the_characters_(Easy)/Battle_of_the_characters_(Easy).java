public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
    	int powerX = 0;
    	int powerY = 0;
    	for (int i = 0; i < x.length(); i++){
    		powerX += Integer.valueOf(x.charAt(i) - 64);
    	}
    	for (int i = 0; i < y.length(); i++){
    		powerY += Integer.valueOf(y.charAt(i) - 64);
    	}
        return (powerX > powerY) ? x : (powerX < powerY) ? y : "Tie!"; 
    }
}