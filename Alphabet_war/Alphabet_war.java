public class Kata{
    public static String alphabetWar(String fight){
    	String leftWins = "Left side wins!";
    	String rightWins = "Right side wins!";
    	String draw = "Let's fight again!";
    	String result = "";
    	int leftPower = 0;
    	int rightPower = 0;
    	for(int i = 0; i < fight.length(); i++){
    		if(fight.charAt(i) == 'w'){
    			leftPower += 4;
    		}else if(fight.charAt(i) == 'p'){
    			leftPower += 3;
    		}else if(fight.charAt(i) == 'b'){
    			leftPower += 2;
    		}else if(fight.charAt(i) == 's'){
    			leftPower += 1;
    		}else if(fight.charAt(i) == 'm'){
    			rightPower += 4;
    		}else if(fight.charAt(i) == 'q'){
    			rightPower += 3;
    		}else if(fight.charAt(i) == 'd'){
    			rightPower += 2;
    		}else if(fight.charAt(i) == 'z'){
    			rightPower += 1;
    		}
    	}
    	return ((leftPower - rightPower) > 0) ? leftWins : ((leftPower - rightPower) < 0) ? rightWins : draw;
    }
}