public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    // Your code here!
    int catYears;
    int dogYears;

    if(humanYears == 1){
      catYears = humanYears*15;
      dogYears = humanYears*15;
    }else if(humanYears == 2){
      catYears = (humanYears-1)*15+(humanYears-1)*9;
      dogYears = (humanYears-1)*15+(humanYears-1)*9;
    }else{
      catYears = (humanYears+(1-humanYears))*15+(humanYears+(1-humanYears))*9+(humanYears-2)*4;
      dogYears = (humanYears+(1-humanYears))*15+(humanYears+(1-humanYears))*9+(humanYears-2)*5;
    }
    return new int[]{humanYears,catYears,dogYears};
  }

}
