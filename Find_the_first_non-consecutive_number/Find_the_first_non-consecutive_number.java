class FirstNonConsecutive {
  static Integer find(final int[] array) {
    if(array[0] >= 0){
      for(int i = 0; i < array.length-1; i++){
        if(array[i]+1 != array[i+1]){
          return array[i+1];
        }
      }
    }else{
      for(int i = 0; i < array.length-1; i++){
        if(array[i]+1 != array[i+1]){
          return array[i+1];
        }
      }
    }
    return null;
  }
}
