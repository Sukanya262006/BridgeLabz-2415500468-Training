import java.util.Random;

public class RandomNumbersStats {
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rand.nextInt(9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        double avg = (double)sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Generated: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
        double[] res = findAverageMinMax(arr);
        System.out.println("Average: " + res[0] + " Min: " + res[1] + " Max: " + res[2]);
    }
}
