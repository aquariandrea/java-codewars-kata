public class Dinglemouse {

  public static int riders(final int[] stations) {
    int pony = 1;
    int max = 0;
    for(int i = 0; i < stations.length; i++){
      max = max + stations[i];
      if(max >= 100){
        pony = pony + 1;
        max = stations[i];
      }
     }
    return pony;
  }
}
