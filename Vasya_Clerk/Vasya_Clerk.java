public class Line {
  public static String Tickets(int[] peopleInLine){
    int dollar25 = 0;
    int dollar50 = 0;
    int dollar100 = 0;
    String answer = "";

    for (int i = 0; i < peopleInLine.length ; i++){

      if (peopleInLine[i] == 25){
          answer = "YES";
          dollar25 ++;
        }else if(peopleInLine[i] == 50){
          if(dollar25 >=1){
            dollar25 --;
            answer = "YES";
            dollar50 ++;
          }else if(dollar25 < 1){
            answer = "NO";
            break;
          }
        }else if(peopleInLine[i] == 100){
          if(dollar25>=1 && dollar50 >=1){
            dollar25--;
            dollar50--;
            answer = "YES";
            dollar100++;
          }else if(dollar25>=3){
            dollar25 = dollar25-3;
            answer="YES";
            dollar100++;
        }else{
          answer = "NO";
          break;
        }
      }
    }
    return answer;
  }
}
