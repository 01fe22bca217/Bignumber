public class Bignumber {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 50, 20, 40}; // Example array
        int max = numbers[0]; // Assume the first element is the largest

        // Iterate through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The biggest number in the array is: " + max);
    }
}
