class Composing {    
    public static String compose(String s1, String s2) {
        StringBuilder myBuilder = new StringBuilder();
        String[] myS1Array = s1.split("\n");
        String[] myS2Array = s2.split("\n");
        for(int i = 0; i < myS1Array.length; i++){
        	myBuilder.append(myS1Array[i].substring(0, 1+i));
        	myBuilder.append(myS2Array[myS2Array.length-1-i].substring(0, (myS2Array[myS2Array.length-1-i].length())-i));
        	if(i < myS1Array.length-1){
        		myBuilder.append("\n");
        	}
        }
        return myBuilder.toString();
    }
}