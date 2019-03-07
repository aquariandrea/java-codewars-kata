public class Kata {    
    public static boolean abundantNumber(int num) {
        int sumProperDivisor = 0;
        for(int i = 1; i < num; i++){
        	if(num%i == 0){
        		sumProperDivisor = sumProperDivisor + i;
        	}
        }
        return num < sumProperDivisor;
    }    
}