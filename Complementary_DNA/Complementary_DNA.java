public class DnaStrand {
  public static String makeComplement(String dna) {
  	StringBuilder myBuilder = new StringBuilder();
  	for(int i = 0; i < dna.length(); i++){
  		char a = dna.charAt(i);
  		if(a == 'A'){
  			myBuilder.append("T");
  		}else if(a == 'T'){
  			myBuilder.append("A");
  		}else if(a == 'C'){
  			myBuilder.append("G");
  		}else if(a == 'G'){
  			myBuilder.append("C");
  		}
  	}
  	return myBuilder.toString();
  }
}