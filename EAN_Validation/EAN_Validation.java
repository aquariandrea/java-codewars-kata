public class EANValidator {    
    public static boolean validate(final String eanCode) {
    	String[] myString = eanCode.split("");
    	Integer checksum = Integer.valueOf(myString[12]);
      int validate;
     	int sum = 0;
      	for(int i = 0; i < myString.length-1;i++){
       		if(i%2 == 0){
       			sum = sum + (Integer.valueOf(myString[i])*1);
       		}else{
       			sum = sum + (Integer.valueOf(myString[i])*3);
       		}
       }
      if(sum % 10 == 0){
      	validate = 0;
      }else{
      	validate = 10 - (sum % 10);
      }
      return (validate == checksum) ? true : false;
    }
}