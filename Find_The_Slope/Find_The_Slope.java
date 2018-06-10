public class Slope
{

  public String slope(int[] points)
    {
      if(points[2] == points[0]){
        return "undefined";
		} else {
        return String.valueOf((((points[3]-points[1])/(points[2]-points[0]))));
      }
  }
}
