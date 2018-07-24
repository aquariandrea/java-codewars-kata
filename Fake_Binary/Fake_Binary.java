public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder myBuilder = new StringBuilder();
        String[] myString = numberString.split("");
        for(String each : myString){
          if(Integer.valueOf(each) < 5){
            myBuilder.append("0");
          }else{
            myBuilder.append("1");
          }
        }
      return myBuilder.toString();
    }
}
