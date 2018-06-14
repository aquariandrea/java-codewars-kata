public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    switch(rating.toLowerCase()){
      case "terrible":
        return new Integer(0);
      case "poor":
        return new Integer((int) Math.ceil(amount / 100 * 5));
      case "good":
        return new Integer((int) Math.ceil(amount / 100 *10));
      case "great":
        return new Integer((int) Math.ceil(amount / 100 *15));
      case "excellent":
        return new Integer((int) Math.ceil(amount / 100 *20));
    }
    return null;
  }
}
