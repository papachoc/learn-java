// Learning recursion in Java
//Compute fibonacci number for a given term X [F(X) = F(X-1) + F(X-2)]

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int term = 1;
        System.out.print("Enter number: ");

        while ((term = scan.nextInt()) != 0) {
            System.out.println(fib(term));
            System.out.print("Enter number: ");
        }

    }

    static int fib(int x) {
        if (x <= 1)
            return x;
        else
			return (fib(x-1) + fib(x-2));
    }
}
