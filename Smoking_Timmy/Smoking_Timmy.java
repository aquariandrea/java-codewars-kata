public class SmokingTimmy{
  public static int startSmoking(int bars,int boxes){
  		int cigaretteTotal = (bars *10*18) + (boxes * 18);
     	if(cigaretteTotal == 0) return 0;
  		int cigaretteStubs = 0;
  		int cigaretteSmoked = 0;
  		while(cigaretteTotal > 0){
  			cigaretteTotal = cigaretteTotal - 1;
  			cigaretteStubs = cigaretteStubs + 1;
  			cigaretteSmoked = cigaretteSmoked + 1;
  			if(cigaretteStubs >=5){
  				cigaretteTotal = cigaretteTotal + 1;
  				cigaretteStubs = cigaretteStubs % 5;
  			}
  		}
    return cigaretteSmoked;
  }
}