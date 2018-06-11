public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      int[] result = new int[2];
      int[] resultNull = new int[0];
      int count = 0;
      int sum = 0;
      if(input == null){
        return resultNull;
      }
      if(input.length == 0){
        return resultNull;
      }
      for(int each : input){
        if(each > 0){
          count++;
        }else{
          sum += each;
        }
      }
      result[0] = count;
      result[1] = sum;
      return result;
    }
}
