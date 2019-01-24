public class Alarm {  
  public static boolean setAlarm(boolean employed, boolean vacation) {
    boolean reply = false;
    if(employed == true && vacation == false) reply = true;
    return reply;
  }
}