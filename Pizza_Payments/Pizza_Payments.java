public class PizzaPayments {
  public static double michaelPays(double cost) {
    double share = 0.0;
    if(cost<5){
      share = cost;
    }else if(cost/3 > 10){
      share = cost - 10;
    }else{
      share = cost / 3 * 2;
    }
    return Math.round(share*100.0)/100.0;
  }
}
