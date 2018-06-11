public class TrafficLights {

  public static String updateLight(String current) {
    String update = "";
    if(current == "green"){
      update =  "yellow";
    }
    if(current == "yellow"){
      update = "red";
    }
    if(current == "red"){
      update = "green";
    }
    return update;
  }
}
