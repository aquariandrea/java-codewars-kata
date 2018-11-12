class Kata {
  public static String getMiddle(String word) {
  	int middle = 0;
  	int wordLength = word.length();
  	StringBuilder myBuilder = new StringBuilder();

  	if((wordLength % 2) == 0){
  		middle = word.length() / 2;
  		myBuilder.append(word.charAt(middle-1)).append(word.charAt(middle));
  	}else{
  		middle = (word.length() / 2) +1;
  		myBuilder.append(word.charAt(middle-1));
  	}
  	return myBuilder.toString();
  }
}