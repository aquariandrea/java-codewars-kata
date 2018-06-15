class Barycenter {

  public static double[] barTriang(double[] x, double[] y, double[] z){
    double[] barycenter = new double[2];
    double baryX = (x[0] + y[0] + z[0]) / 3;
    double baryY = (x[1] + y[1] + z[1]) / 3;
    barycenter[0] = Math.round(baryX*10000.00)/10000.00;
    barycenter[1] = Math.round(baryY*10000.00)/10000.00;
    return barycenter;
  }
}
