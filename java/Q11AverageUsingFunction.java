import java.util.Scanner;

public class Q11AverageUsingFunction
{
    public static int average(int a, int b,int c)
    {
        int average = (a+b+c)/3;
        return average;
   }

public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the a");
    int a = sc.nextInt();
    System.out.println("enter the b");
    int b = sc.nextInt();
    System.out.println("enter the c");
    int c = sc.nextInt();
    System.out.println("average of three number : "+average(a,b,c));
}}