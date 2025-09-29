import java.util.Scanner;

public class d3_loopDowhile {
    public static void main(String[] args) 
    {
       
        int i=1;
        do
        {
            
         System.out.println("amit");
         i++;
        }
        while (i<=5);
 
        // number tbtak print hota rahega jbtk hume vo number na mil jay jo 10 ka multiple ho.
        Scanner sc = new Scanner(System.in);
       
        do{
           System.out.println("enter your number :");
           int n = sc.nextInt();
           
           if(n%10==0)
           {
            break;
           }
            System.out.println(n);
        }
        while(true);

     //  break statement
      
      for(int j=1; j<=5; j++)
      {
         
       if(j==3)
       {
        break;
       }
       System.out.println(j);
       }
       System.out.println("i am out of the loop");
     
     
     //continue statement : agar hame koi bari miss  krni hai toh hum isska use krte hai
         
       do{
        System.out.println("enter your number :");
        int n = sc.nextInt();
      
        if(n%10==0)
        {
            continue;
        }
        System.out.println(n);
      }
      while(true);
    
  
      // check the number is prime or not
       
          

      
      }
    }
    


    

