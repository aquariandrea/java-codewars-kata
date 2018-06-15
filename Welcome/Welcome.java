import java.util.HashMap;

public class Welcome {
   public static String greet(String language){
   HashMap<String, String> myMap = new HashMap<String, String>();
   myMap.put("english", "Welcome");
   myMap.put("czech", "Vitejte");
   myMap.put("danish", "Velkomst");
   myMap.put("dutch", "Welkom");
   myMap.put("estonian", "Tere tulemast");
   myMap.put("finnish", "Tervetuloa");
   myMap.put("flemish", "Welgekomen");
   myMap.put("french", "Bienvenue");
   myMap.put("german", "Willkommen");
   myMap.put("irish", "Failte");
   myMap.put("italian", "Benvenuto");
   myMap.put("latvian", "Gaidits");
   myMap.put("lithuanian", "Laukiamas");
   myMap.put("czech", "Vitejte");
   myMap.put("polish", "Witamy");
   myMap.put("spanish", "Bienvenido");
   myMap.put("swedish", "Valkommen");
   myMap.put("welsh", "Croeso");
   if(myMap.containsKey(language)) return myMap.get(language);
   return "Welcome";
   }
}
