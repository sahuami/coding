import java.util.Scanner;

public class b_Operators {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      float num = sc.nextFloat();
      float num1 = sc.nextFloat();

      int num2 = sc.nextInt();
      int num3 = sc.nextInt();

      int num5 = num2 + num3;
      System.out.println("First value: " + (num + num1) + "  , second value: " + num5 + ".");




      // (1.a) AIRTHMETIC BINARY OPERATOR
      int a = 10, b = 5;
      System.out.println("add =" + (a + b));
      System.out.println("subtract =" + (a - b));
      System.out.println("multiply =" + (a * b));
      System.out.println("divide =" + (a / b));
      System.out.println("modulo(remainder) =" + (a % b));
      // (1.b) AIRTHMETIC UNARY OPERATOR
      // pre increment: value change than value use
      int r = 10;
      int s = ++r;
      System.out.println(r);
      System.out.println(s);
      // post increment: value use than value change
      int c = 15;
      int d = c++;
      System.out.println(c);
      System.out.println(d);
      // pre decrement
      int x = 20, y = --x;
      System.out.println(x);
      System.out.println(y);
      // post decrement
      int p = 25, q = p--;
      System.out.println(p);
      System.out.println(q);

      // (2) ASSIGNMENT OPERATOR

      int A = 10;
      A += 5;// its means A= A+5
      System.out.println(A);
      int B = 20;
      B -= 10; // its means B = B-10
      System.out.println(B);
      int C = 20;
      C *= 10; // its means C = C*10
      System.out.println(C);
      int D = 20;
      D /= 10; // its means D = D/10
      System.out.println(D);

      // (3) RELATIONAL OPERATOR
      int i = 10, j = 4;
      System.out.println(i == j); // equal to
      System.out.println(i != j); // not equal to
      System.out.println(i > j); // greater than
      System.out.println(i >= j); // greater than or equal to
      System.out.println(i < j); // less than
      System.out.println(i <= j); // less than or equal to

      // (4) LOGICAL OPERATOR
      System.out.println((3 > 2) && (5 > 4));// AND: both true than answer true
      System.out.println((3 < 2) || (5 < 4));// OR: both false than answer false
      System.out.println(!(3 > 2));// NOT:
   }
}
