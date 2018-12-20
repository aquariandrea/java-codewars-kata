import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int[] menFromBoys(final int[] values) {
        int arrEven [] = Arrays.stream(values).filter(a->a%2==0).distinct().sorted().toArray();
        int arrOdd [] = Arrays.stream(values).filter(a->a%2!=0).distinct().map(a->a*(-1)).sorted().map(a->a*(-1)).toArray();

        return IntStream.concat(IntStream.of(arrEven),IntStream.of(arrOdd)).toArray();
    }
}