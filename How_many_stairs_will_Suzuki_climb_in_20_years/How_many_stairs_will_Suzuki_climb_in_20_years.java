public class Kata
{
    public static long stairsIn20(int[][] stairs){
      long result = 0l;
      for(int i = 0; i < stairs.length; i++){
        for(int j = 0; j < stairs[0].length; j++){
          result += stairs[i][j];
        }
      }
      return result *20;
    }
}
