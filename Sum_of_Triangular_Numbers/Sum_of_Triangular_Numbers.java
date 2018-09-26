public class Kata{
  public static int sumTriangularNumbers(int n){
  	int triangleNumber = 0;
  	int result = 0;
  	if(n < 0) return 0;
    for(int i = 1; i <= n; i++){
    	triangleNumber = triangleNumber + i;
    	result = result + triangleNumber;
    }
    return result;
  }
}