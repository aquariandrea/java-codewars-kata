public class Dinglemouse {

  public static int tvRemote(final String word) {
    int count = 0;
    int[] start = new int[]{0,0};
    String[][] myTable = new String[][]{{"a","b","c","d","e","1","2","3"}, {"f","g","h","i","j","4","5","6"}, {"k", "l", "m","n", "o", "7","8","9"}, {"p", "q","r", "s", "t", ".", "@", "0"}, {"u", "v", "w", "x", "y", "z", "_", "/"}};
    String[] myWord = word.split("");
    for(int i = 0; i < myWord.length; i++){
      for(int j = 0; j <5; j++){
        for(int z = 0; z <8; z++){
          if(myWord[i].equals(myTable[j][z])){
            count += 1 + Math.abs(start[0] - j) + Math.abs(start[1] - z);
            start[0] = j;
            start[1] = z;
          }
        }
      }
    }
    return count;
  }
}
