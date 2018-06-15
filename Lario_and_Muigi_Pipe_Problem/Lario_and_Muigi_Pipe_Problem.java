public class Kata {
  public static int[] pipeFix(int[] numbers) {
    int count = 0;
    for(int i = 0; i < numbers.length-1; i++){
      if(numbers[i+1] - numbers[i] != 1){
        count = count + (numbers[i+1] - numbers[i]-1);
      }
    }
    int[] result = new int[numbers.length + count];
    result[0] = numbers[0];
    for(int i = 1; i < result.length; i++){
      result[i] = result[i-1] + 1;
    }
    return result;
  }
}
