public class ArrayPrinter {

    public static String printArray(Object array[]) {
      StringBuilder myBuilder = new StringBuilder();
      for(Object each : array){
        myBuilder.append(each).append(",");
      }
      return myBuilder.substring(0, myBuilder.length()-1);
    }
}
