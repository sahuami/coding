import java.util.Scanner;

public class f2_Functionwithparameters {

  // function with parameter 1st way

  public static void calculateAdd(int c, int d) /*
                                                 * parameter yaha likhna hoga bracket ke
                                                 * andar. (parameter ka mtlb hota hai input dena) jo bracket ke
                                                 * andar likhte hai usko "parameter or formal parameter bolte hai"
                                                 */
  {
    int add = c + d;
    System.out.println("addition is :" + add);
  }

  // function with parameter 2nd way

  // sum of number(function)
  public static int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;

  }

  // swap (function)

  public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
    System.out.println("x =" + x);
    System.out.println("y =" + y); // ye dono print agar hum apne main function ke andar karayge toh hamri real
                                   // value print ho jaygi 'x' and 'y' ki swap wali value print nhi hogi ese isliye
                                   // hota
                                   // hai ki agar hum apne function ke adar parameter dete hai toh jo bhi change
                                   // honge hamare function ke adar vo hamare main function ke andar dikhai nhi
                                   // denge isse concept ko call by value khate hai

  }

  // product of number (function)
  public static int multiply(int p, int q) {
    int product = p * q;
    return product;
  }

  // factorial of number(function)
  public static int factorial(int N) {
    int f = 1;
    for (int i = 1; i <= N; i++) {
      f = f * i;
    }
    return f;
  }

  // calculate binomial coefficient(function)
  public static int BC(int n, int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_n_minus_r = factorial(n - r);

    int BC = fact_n / (fact_r * fact_n_minus_r);
    return BC;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // addition of number
    System.out.println("enter the c");
    int c = sc.nextInt();
    System.out.println("enter the d");
    int d = sc.nextInt();
    calculateAdd(c, d); /*
                         * uper parameter likhne ke baad yaha bhi chnge krna hoga bracket ke andar.
                         * yaha jo bracket ke andar likhte hai usko
                         * " argument or actual parameter bolte hai"
                         */

    // sum of number
    System.out.println("enter the a");
    int a = sc.nextInt();
    System.out.println("enter the b");
    int b = sc.nextInt();
    int sum = calculateSum(a, b); /*
                                   * uper parameter likhne ke baad yaha bhi chnge krna hoga
                                   * bracket ke andar. yaha jo bracket ke andar likhte hai usko
                                   * " argument or actual parameter bolte hai"
                                   */
    System.out.println("sum is :" + sum);

    // swap = value exchange
    int x = 5;
    int y = 10;
    swap(x, y); /*
                 * In case of swap in dono ( System.out.println("x ="+x);
                 * System.out.println("y =" + y);) ko main function m nhi
                 * likhege kyuki main funtion m likhge toh swap ni hogi value
                 * or apni original value show karega
                 */
    // product of number
    System.out.println("enter the p");
    int p = sc.nextInt();
    System.out.println("enter the q");
    int q = sc.nextInt();
    int product = multiply(p, q);
    System.out.println("product of number =" + product);

    // factorial of number
    System.out.println("enter the N");
    int N = sc.nextInt();
    System.out.println("the factorial :" + factorial(N));

    // calculate binomial coefficient
    System.out.println("enter the n");
    int n = sc.nextInt();
    System.out.println("enter the r");
    int r = sc.nextInt();
    System.out.println(" the binomial coefficient:" + BC(n, r));

  }
}
