public class Kata {
  public static String stringy(int size)
  {
    String string = "";
    for(int i = 1; i <= size; i++)
    {
      if(i%2 != 0){
        string = string + String.valueOf(1);
      }
      else{
        string = string + String.valueOf(0);
      }
    }
    return string;
  }
}
