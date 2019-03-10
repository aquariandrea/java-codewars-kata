class StrongNumber {
    
    public static String isStrongNumber(int num) {
    	int isStrongNumber = 0;
    	int loopCounter = num;
    	while (loopCounter  >= 1){
    		int numDecimalPos = loopCounter % 10;
    		isStrongNumber = isStrongNumber + factorial(numDecimalPos);
    		loopCounter = loopCounter / 10;
    	}
    	return (num == isStrongNumber) ? "STRONG!!!!" : "Not Strong !!";
    }

    public static int factorial(int num){
    	int factorialNum = 1;
    	for(int i = 1; i <= num; i++){
    		factorialNum = factorialNum * i;
    	}
    	return factorialNum;
    }
}