import java.util.List;

public class BinaryArrayToNumber {
  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
  	StringBuilder myBuilder = new StringBuilder();
  	for(int i = 0; i < binary.size(); i++){
  		myBuilder.append(binary.get(i));
  	}
  	return Integer.parseInt(myBuilder.toString(), 2);
  }
}