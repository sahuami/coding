import java.util.Scanner;

public class e1_Pattern {

    // NESTED LOOP

    public static void main(String[] args) {

        // PRINT STAR PATTERN

        for (int line = 1; line <= 5; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // PRINT inverted star pattern

        Scanner sc = new Scanner(System.in);
        System.out.println("enter ther n");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // PRINT half pyramid pattern

        System.out.println("enter ther N");
        int N = sc.nextInt();
        for (int line = 1; line <= N; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }

        // PRINT character pattern

        char ch = 'A';

        for (int line = 1; line <= 5; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
