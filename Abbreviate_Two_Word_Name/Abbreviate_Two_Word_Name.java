public class AbbreviateTwoWords {

  public static String abbrevName(String name)
  {
    String[] myName = name.split(" ");
    String initial1 = String.valueOf(myName[0].charAt(0));
    String initial2 = String.valueOf(myName[1].charAt(0));
    return initial1.concat(".").concat(initial2).toUpperCase();
  }
}
