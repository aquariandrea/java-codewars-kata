import java.util.Arrays;

public class Kata
{
  public static int sum(int[] numbers){
    int result = 0;
    if(numbers == null || numbers.length < 2){
      result = 0;
    }else{
      Arrays.sort(numbers);
      for(int i = 1; i < numbers.length-1;i++){
        result += numbers[i];
      }
    }
    return result;
  }
}
