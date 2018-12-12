public class Kata {
    public static int snail(int column, int day, int night) {
    	int days = 0;
    	int distance = 0;
    	while(distance < column){
    		distance = distance + day;
        if(distance >= column){
        	days++;
        	break;
    		}else{
        	distance = distance - night;
        	days++;
      	}
      }
    	return days;
    }
}