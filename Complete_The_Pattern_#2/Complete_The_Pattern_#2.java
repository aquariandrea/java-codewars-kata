public class CompleteThePattern {
    public static String pattern ( int n) {
	    StringBuilder myBuilder = new StringBuilder();
	    int newSequence = n;
	    int countDown = n;
	    for(int i = 0; i < n; i++){
		    for(int j = 0; j < countDown; j++){
		    	myBuilder.append(newSequence);
		    	newSequence--;
	    	}
        	newSequence = n;
	    	countDown--;
	    	if(i < (n-1)){
	    		myBuilder.append("\n");
	    	}
    	}
    	return myBuilder.toString();
    }
}