import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        System.out.print("Enter number: ");

        while ((num = scan.nextInt()) != 0) {
            is_sum_of_squares(num);
            System.out.print("Enter number: ");
        }
    }

    static boolean is_sum_of_squares(int x) {
        int max = (int) Math.floor(Math.sqrt(x));
        int i, j;
        boolean sum_of_sq = false;

        for (i = max; i > 0; i--) {
            j = (int) (x - Math.pow(i,2));

            if ((j != 0) && is_perfect_sq(j)) {
                j = (int)Math.sqrt(j);
                System.out.println(i + "^2 + " + j + "^2 = " + x);
                sum_of_sq = true;
            }
        }
        if (sum_of_sq == false) {
            System.out.println("Not a sum of squares");
        }
        return sum_of_sq;
    }

    static boolean is_perfect_sq (int x) {

        if (Math.pow(Math.floor(Math.sqrt(x)),2) == x) {
            return true;
        }
        return false;
    }
}

