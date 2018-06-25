import java.util.ArrayList;

public class Sum  {
   public int GetSum(int a, int b){
    ArrayList<Integer> result = new ArrayList<Integer>();
    if(a == b){
      return a;
    }else if(a < b){
      while(a <= b){
        result.add(a);
        a++;
      }
    }else if(b < a){
      while(b <= a){
        result.add(b);
        b++;
      }
    }
    int sum = result.stream().mapToInt(Integer::intValue).sum();
    return sum;
   }
}
