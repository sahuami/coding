import java.util.*;
public class Q7NumberPositiveOrNegative 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        int number = sc.nextInt();
        if( number > 0)
        {
            System.out.println("positive");

        }
        else if(number == 0)
        {
            System.out.println("neither positive nor negative");
        }

        
        else
        {
            System.out.println("negative");
        }

    }
}


