public class Kata {

  public static int toBinary(int n) {
    int a = n;
    StringBuilder myBuilder =  new StringBuilder();

    if(a == 0){
      return 0;
    }else{
      while(a>0){
        int b = a%2;
        myBuilder.append(b);
        a = a/2;
      }
    }
    myBuilder.reverse();
    return Integer.parseInt(myBuilder.toString());
  }
}
