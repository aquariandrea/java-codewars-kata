public class Kata {
  public static String HighAndLow(String numbers) {
  	String HighAndLow = "";
  	String[] arrayNumbers = numbers.split(" ");
  	if (arrayNumbers.length == 1){
  		HighAndLow = numbers + " " + numbers;
  	}else{
  		int min = Integer.valueOf(arrayNumbers[0]);
  		int max = Integer.valueOf(arrayNumbers[0]);
  		for(int i = 1; i < arrayNumbers.length; i++){
  			int temp =  Integer.valueOf(arrayNumbers[i]);
  			if(temp <= min){
  				min = temp;
  			}
  			if(temp >= max){
  				max = temp;
  			}
  		}
  		HighAndLow = max + " " + min;
  	}
    return HighAndLow;
  }
}