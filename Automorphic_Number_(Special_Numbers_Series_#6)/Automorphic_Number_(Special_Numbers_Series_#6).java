public class Solution{
    public static String autoMorphic(int number){
    	String myString = String.valueOf(number*number);
      return (myString.endsWith(String.valueOf(number))) ? "Automorphic" : "Not!!";
    }
}