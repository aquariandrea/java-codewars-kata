import java.text.DecimalFormat;

public class Calculate {
  public static String bmi(double weight, double height) {
    DecimalFormat df = new DecimalFormat("#.#");
    double bmi = Double.valueOf(df.format(weight / (height*height)));
    return bmi > 30 ? "Obese" : bmi > 25 ? "Overweight" : bmi > 18.5 ? "Normal" : "Underweight";
  }
}
