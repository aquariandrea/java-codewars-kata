class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        //TODO
    int[] newRaw = new int[n];
    int firstIndexNumber = 0;
    int sumOfOdd = 0;
    int countOfOdd = 0;

    if (n == 1){
    sumOfOdd = 1;
    }else{

    for (int i = n-1; i>=1; i--){
      countOfOdd +=i;
    }
    firstIndexNumber = (countOfOdd*2)+1;

    for (int i=0 ; i < n; i++){
      newRaw[i] = firstIndexNumber;
      firstIndexNumber = firstIndexNumber + 2;
    }

    for (int i = 0; i < n; i++){
    sumOfOdd = sumOfOdd + newRaw[i];
    }

    }
    return sumOfOdd;

    } // end of method
} // end of class
