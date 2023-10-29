# Factorial-Calculator-With-Java
This program calculates the factorial of a number using a recursive method.

Here's how the program works:

1. The main method is the entry point of the program. It begins by setting the number variable to the value for which you want to calculate the factorial. In this example, number is set to 5.
2. The program then calls the FactorialCalculator method, passing the number as an argument. It stores the result of the calculation in the factorial variable.
3. The FactorialCalculator method is a recursive function that calculates the factorial of a given number n. The logic is as follows:
If n is equal to 0, the base case is reached, and the method returns 1. This is because the factorial of 0 is defined to be 1.
If n is greater than 0, the method recursively calls itself with n - 1 and multiplies the result by n. This process continues until n reaches 0, at which point the recursive calls stop.
4. Finally, the program prints the result, which is the factorial of the original number, to the console.

If you run the program with number set to 5, it will calculate the factorial of 5, which is 5! = 5 * 4 * 3 * 2 * 1 = 120, and you will see the following output:
Factorial of 5 is 120

You can change the value of the number variable in the main method to calculate the factorial of a different number as needed.
