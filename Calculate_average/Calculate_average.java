import java.util.stream.*;

public class Kata{
  public static double find_average(int[] array){
    double sum = (double) IntStream.of(array).sum();
    double result = sum/array.length;
    return result;
  }
}
