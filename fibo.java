import java.util.*;

public class Main {

    // Recursive function
    public static int fibRec(int n) {
        if (n < 0) {
            return -1; // negative
        }
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibRec(n - 1) + fibRec(n - 2);
        }
    }

    // Iterative
    public static int fibIter(int n) {
        if (n < 0) {
            return -1; // negative
        }
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c; // third value
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // printing n Fibonacci numbers
    public static void printFibSeries(int n) {
        if (n < 0) {
            System.out.println("Enter positive number");
            return;
        }
        if (n == 0 || n == 1) {
            System.out.print(n + " ");
            return;
        }

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to print nth fibonacci number using recursion");
            System.out.println("Enter 2 to print nth fibonacci number using iterative");
            System.out.println("Enter 3 to print fibonacci series");
            System.out.println("Enter option");

            int op = sc.nextInt();

            if (op == 1) {
                int n1;
                System.out.println("Enter the value of n");
                n1 = sc.nextInt();
                int res = fibRec(n1);
                System.out.println("Result is: " + res);
            } 
            else if (op == 2) {
                int n2;
                System.out.println("Enter the value of n");
                n2 = sc.nextInt();
                int res = fibIter(n2);
                System.out.println("Result is: " + res);
            } 
            else if (op == 3) {
                int n3;
                System.out.println("Enter the value of n");
                n3 = sc.nextInt();
                printFibSeries(n3);
            } 
            else {
                System.out.println("Invalid option");
            }
        }
    }
}
