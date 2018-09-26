public class Kata {
    public static int houseNumbersSum(final int[] arr) {
        int result = 0;
        for (int each: arr){
        	result = result + each;
        	if(each == 0){
        		break;
        	}
        }
        return result;
    }
}