public class Kata{
  public static String datingRange(int age) {
    String result = "";
    if(age <= 14){
      int min = (int) (age - 0.10 * age);
      int max = (int) (age + 0.10 * age);
      result = String.format("%s-%s", min, max);
    }else{
      int min = age/2 +7;
      int max = (age-7)*2;
      result = String.format("%s-%s", min, max);
    }
    return result;
  }  
}
