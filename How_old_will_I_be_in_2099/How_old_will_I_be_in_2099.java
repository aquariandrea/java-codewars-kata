public class AgeDiff{
  public static String CalculateAge(int birth, int yearTo){
    String result = "";
    if(yearTo > birth){
      if(yearTo - birth != 1){
        result = String.format("You are %s years old.", yearTo - birth);
      }else{
        result = String.format("You are %s year old.", yearTo - birth);
      }
    }else if(yearTo == birth){
      result = "You were born this very year!";
    }else{
      if(birth - yearTo != 1){
        result = String.format("You will be born in %s years.", birth - yearTo);
      }else{
        result = String.format("You will be born in %s year.", birth - yearTo);
      }
    }
    return result;
  }
}
