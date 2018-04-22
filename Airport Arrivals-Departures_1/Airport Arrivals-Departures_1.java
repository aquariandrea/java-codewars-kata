class Dinglemouse {

  private static final String ALPHABET = Preloaded.ALPHABET;
  // ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789

  public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
    // new String to be returned after changing all the character in the words
    String[] newString = new String[lines.length];
    // work on a single word per loop
    for (int i1=0; i1 < lines.length; i1++){
      String oldWord = lines[i1];
      String newWord = "";
      int flap = 0;
      // work on a single character per word
      for(int i2 = 0; i2 < oldWord.length(); i2++){
        // extract from string one char per loop
        String oldChar = oldWord.substring​(i2, (i2+1));
        // index of the char in final field ALPHABET
        int indexOldChar = ALPHABET.indexOf​(oldChar);
        // get the correct rotor for the char in question
        int actualRotor = rotors[i1][i2];
        // counting the flap
        flap = flap + actualRotor;
        // index of the new char
        int indexNewChar = 0;
        // get the new index for the char to replace the old one
        indexNewChar = (indexOldChar + flap) % 54;
        // get the new char replacement from final field ALPHABET
        String newChar = ALPHABET.substring​(indexNewChar, indexNewChar+1);
        newWord = newWord + newChar;
      }
      newString[i1] = newWord;
      }
    return newString;
  }
}
