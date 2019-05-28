public class SequenceSum{
  public static String showSequence(int value){
  	if(value < 0) return (value + "<0");
  	if(value == 0) return "0=0";
  	StringBuilder myBuilder = new StringBuilder();
  	int sumOfIncreasedValue = 0;
  	for(int i = 0; i <= value; i++){
  		myBuilder.append(i);
        if(i < value){
  			  myBuilder.append("+");
  		  }
  		sumOfIncreasedValue = sumOfIncreasedValue + i;
  	}
  	myBuilder.append(" = ");
  	myBuilder.append(sumOfIncreasedValue);
  	return myBuilder.toString();
  }
}