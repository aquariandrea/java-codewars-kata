public class EasyWallpaper {

  public String wallpaper(double l, double w, double h) {
    final double wallpaperWidth = 0.52;
    final double wallpaperHight = 10;
    final double extra = 1.15;
    final String[] englishLang = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    if(l*w*h == 0.0){
      return "zero";
    }
    double roomSurface = ((l+w)*2)*h;
    double wallpaperSurface = wallpaperWidth*wallpaperHight;
    double result = Math.round(0.5 + ((roomSurface / wallpaperSurface) * extra));
    int arrayPos = (int) result;
    return englishLang[arrayPos];
  }
}
