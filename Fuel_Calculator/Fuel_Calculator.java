import java.text.DecimalFormat;

public class Kata{
  public static double fuelPrice(int litres, double pricePerLiter) {
    double discount2 = 0.05;
    double discount4 = 0.10;
    double discount6 = 0.15;
    double discount8 = 0.20;
    double discount10 = 0.25;
    double result = 0;
    DecimalFormat df = new DecimalFormat("0.00");
    if(litres>10){
      result = litres * (pricePerLiter-discount10);
    }else if(litres>=8){
      result = litres * (pricePerLiter-discount8);
    }else if(litres>=6){
      result = litres * (pricePerLiter-discount6);
    }else if(litres>=4){
      result = litres * (pricePerLiter-discount4);
    }else if(litres>=2){
      result = litres * (pricePerLiter-discount2);
    }else{
      result = litres * pricePerLiter;
    }
    return Math.round(result*100.0)/100.0;
  }
}
