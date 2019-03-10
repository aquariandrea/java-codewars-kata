import java.lang.Character;

public class Kata {
  	public static boolean compare(String s1, String s2){
    	return calc(s1) == calc(s2);
  	}

  	public static int calc(String s){
  		int sum = 0;
	  	if(s == null){
	  		sum = 0;
	  	}else if(s.isEmpty()){
        sum = 0;
      }else{
	  		String[] stringArray = s.split("");
	  		sum = 0;
	  			for(int i = 0; i < stringArray.length; i++){
	  				if(Character.isLetter(stringArray[i].charAt(0))){
	  				sum = sum + stringArray[i].toUpperCase().charAt(0);
	  				}else{
	  				sum = 0;
	  				break;
	  				}
	  			}
	  	}
	  	return sum;
	}
}