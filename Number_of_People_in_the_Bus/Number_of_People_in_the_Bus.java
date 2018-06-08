import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int countPassengers = 0;

    for(int i = 0; i < stops.size(); i++){
      int[] busStop = stops.get(i);
      countPassengers = countPassengers + busStop[0]- busStop[1];
    }
    return countPassengers;
  }
}
