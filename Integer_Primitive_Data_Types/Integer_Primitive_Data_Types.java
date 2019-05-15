import java.math.*;

public class Primitive {

    public String determineType(String number) {
            
       double l = Double.parseDouble(number);
       
       if(l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE){
          return "byte";
       }else if(l >= Short.MIN_VALUE && l <= Short.MAX_VALUE){
          return "short";
       }else if(l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE){
          return "int";
       }else if(l >= Long.MIN_VALUE && l <= Long.MAX_VALUE){
          return "long";
       }else return "none";
    }
}