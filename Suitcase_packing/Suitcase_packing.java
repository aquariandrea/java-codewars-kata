public class MrSquare {
    public static Boolean fit_in(int a, int b, int m, int n) {
    	boolean result = true;
        if(a + b > Integer.max(m,n) || Integer.max(a, b) > Integer.min(m,n)) result = false;
        return result;
    }
}