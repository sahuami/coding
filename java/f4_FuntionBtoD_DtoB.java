import java.util.Scanner;

public class f4_FuntionBtoD_DtoB {

    // BINARY TO DECIMAL
    public static void binTodec(int n) {
        int pow = 0;
        int decNum = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("decimal of binary :" + decNum);
    }


    // DECIMAL TO BINARY
    public static void decTobin(int n) {
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int remainder = n % 2;
            binNum = binNum + (remainder * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary to decimal :" + binNum);
    }



    public static void main(String[] args) {

        // BINARY TO DECIMAL
        binTodec(101);

        // DECIMAL TO BINARY
        decTobin(7);

        // BINARY TO DECIMAL(2nd method)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();

        // Converting binary to decimal
        int decimal = Integer.parseInt(binaryString, 2);

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}




