public class ATM {

  public int solve(int n) {
      // Your code here
      int[] nominalValue = {500, 200, 100, 50, 20, 10};
      int counter = 0;

      if ((n % 10) != 0){ // Start If
        counter = -1;
      }else{ // Starts else

      for (int i = 0; i <= 5; i++){ // Start For

        counter = counter + (n / nominalValue[i]);
        n = n % nominalValue[i];

      } // End for

      } // End if

      return counter;

  } // End of solve
} // End of Class
