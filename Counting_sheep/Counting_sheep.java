public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    Boolean b = true;
    int count = 0;
    for(int i = 0; i < arrayOfSheeps.length; i++){
      if(arrayOfSheeps[i] == null) continue;
      if(arrayOfSheeps[i].equals(b)){
        count++;
      }
    }
    return count;
  }
}
