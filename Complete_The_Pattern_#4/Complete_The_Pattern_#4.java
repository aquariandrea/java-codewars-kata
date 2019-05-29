public class Pattern {
	public static String pattern(int n){
		StringBuilder myBuilder = new StringBuilder();
    	if( n <= 0) return "";
    	if( n == 1) return "1";
		for(int i=0; i<n;i++){
			int m = i+1;			
			for(int j=n; j > i;j--){
				myBuilder.append(m);
				m++;
			}
			if(i < n-1){
				myBuilder.append("\n");
			}
		}	
		return myBuilder.toString();
	}
}