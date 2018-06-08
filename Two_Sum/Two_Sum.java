public class Solution
{
    public static int[] twoSum(final int[] numbers, int target){
      int[] myResult = new int[2];

      for(int i=0; i < numbers.length; i++){
        for(int j = i+1; j < numbers.length; j++){
          if((numbers[i]+numbers[j]) == target){
            myResult[0] = (i);
            myResult[1] = (j);
          }
        }
      }
        return myResult;
    }
}
