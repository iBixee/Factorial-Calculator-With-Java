public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 3; // Change this to the number for which you want to calculate the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
