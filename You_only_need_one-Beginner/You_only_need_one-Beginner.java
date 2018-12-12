public class Solution {
    public static boolean check(Object[] a, Object x) {
    	boolean result = false;
        for(int i = 0; i < a.length; i++){
        	if(a[i].equals(x)){
        		result = true;
        	}
        }
        return result;
    }
}