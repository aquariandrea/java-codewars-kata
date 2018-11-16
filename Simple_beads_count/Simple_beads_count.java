public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
    int result = 0;
    if(nBlue < 6){
	    switch(nBlue){
	    	case 0:
	    	case 1: result = 0;
	    		break;
	    	case 2: result = 2;
	    		break;
	    	case 3: result = 4;
	    		break;
	    	case 4: result = 6;
	    		break;
	    	case 5: result = 8;
	    		break;
	    }
    }else{
    	result = (nBlue*2)-2;
    }
    return result;
    }
}