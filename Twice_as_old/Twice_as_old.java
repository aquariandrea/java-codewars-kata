public class TwiceAsOld{

  public static int TwiceAsOld(int dadYears, int sonYears){
    int result = 0;
    int doubleSonYears = (sonYears*2);
    if(doubleSonYears < dadYears){
      result = dadYears - doubleSonYears;
    }else{
      result = doubleSonYears - dadYears;
    }
    return result;
  }
}
