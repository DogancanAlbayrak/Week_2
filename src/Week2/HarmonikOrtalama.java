public class HarmonikOrtalama {
    public static void main(String[] args) {
        // Create an array
        double[] numbers = {1, 2, 3, 4, 5};

        // Calculate harmonic mean
        double harmonicSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / numbers[i]; // Take the reciprocal and add to the sum
        }
        double harmonikOrtalama = numbers.length / harmonicSum; // Divide the length by the sum
        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
    }
}
