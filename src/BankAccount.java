//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Method to calculate the sum of an array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Method to count odd and even numbers between two given numbers
    public static void oddOrEven(int firstNumber, int secondNumber) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Display the first and second numbers of the array
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second number: " + numbers[1]);

        // Calculating the sum of the array
        int sum = calculateSum(numbers);
        System.out.println("The sum of the array is: " + sum);

        // Example usage of oddOrEven method
        oddOrEven(1, 10);
    }
}
