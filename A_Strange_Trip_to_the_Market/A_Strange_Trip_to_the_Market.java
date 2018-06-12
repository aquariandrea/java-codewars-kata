public class Nessie {
    public static boolean isLockNessMonster(String s){
     return s.contains("tree fiddy") ? true : s.contains("three fifty") ? true : s.contains("3.50") ? true : false;
    }
}
