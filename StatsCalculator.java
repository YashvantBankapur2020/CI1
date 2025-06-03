import java.util.Arrays;
public class StatsCalculator {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        double average = calculateAverage(numbers);
        int min = findMin(numbers);
        int max = findMax(numbers);
        double total = sumAll(average, min, max);

        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum of Average + Min + Max = " + total);
    }

    public static double calculateAverage(int[] nums) {
        return Arrays.stream(nums).average().orElse(0);
    }

    public static int findMin(int[] nums) {
        return Arrays.stream(nums).min().orElse(0);
    }

    public static int findMax(int[] nums) {
        return Arrays.stream(nums).max().orElse(0);
    }

    public static double sumAll(double avg, int min, int max) {
        return avg + min + max;
    }
}
