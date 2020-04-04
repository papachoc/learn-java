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
        if (x == 0)
            return 0;
        else if (x == 1)
            return 1;
        else return (fib(x-1) + fib(x-2));
    }
}
