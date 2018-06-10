public class Converter {
  public static float mpgToKPM(final float mpg) {
    final float gal = 4.54609188f;
    final float mil = 1.609344f;

    float result = mpg * mil / gal;
    return (float) Math.round(result*100)/100;
  }
}
