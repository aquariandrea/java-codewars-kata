import java.util.*;

class sorter {
  public static List<String> sort(List<String> textbooks) {
    textbooks.sort(String::compareToIgnoreCase);
    return textbooks;
  }
}
