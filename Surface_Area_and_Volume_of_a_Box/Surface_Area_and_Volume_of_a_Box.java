public class Kata {
    public static int[] getSize(int w,int h,int d) {
        return new int[] {(w*h*2)+(h*d*2)+(w*d*2), (w*h*d)};
    }
}
