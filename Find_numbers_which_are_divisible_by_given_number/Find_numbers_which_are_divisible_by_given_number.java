public class EvenNumbers {
        public static int[] divisibleBy(int[] numbers, int divider) {
        int divisibleCount = 0;
        for(int l : numbers) {
            if(l % divider == 0)
                divisibleCount++;
        }
        int[] retVal = new int[divisibleCount];
        int i = 0;
        for(int l : numbers) {
            if(l % divider == 0)
                retVal[i++] = l;
        }
        return retVal;
    }
}
