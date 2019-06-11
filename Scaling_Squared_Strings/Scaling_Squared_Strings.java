public class Scale {    
    public static String scale(String strng, int k, int v){
	    if(k == 1 && v == 1) return strng;
	    if(strng.equals("")) return strng;
	    String[] myStrArrayK = strng.split("\n");
	    StringBuilder myBuilderK = new StringBuilder();
	    if(k >= 1){
	    	for(int i = 0; i < myStrArrayK.length; i++){
	    		for(int j = 0; j < myStrArrayK[i].length(); j++){
	    			for(int z = 0; z < k; z++){
	    				myBuilderK.append(myStrArrayK[i].charAt(j));
	    			}
	    		}
	    		if(i < (myStrArrayK.length-1)){
	    			myBuilderK.append("\n");
	    		}
	    	}
	    }
	    String[] myStrArrayV = myBuilderK.toString().split("\n");
      StringBuilder myBuilderV = new StringBuilder();
	    if(v >= 1){
	    	for(int i = 0; i < myStrArrayV.length; i++){
	    		for(int j = 0; j < v; j++){
	    			myBuilderV.append(myStrArrayV[i]);
	    			if(j < v-1){
            			myBuilderV.append("\n");
            		}
	    		}
	    		if(i < myStrArrayV.length-1){
	    			myBuilderV.append("\n");
	    		}
	    	}
	    }
		return myBuilderV.toString();
    }
}