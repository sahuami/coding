
public class j_Bit_manipulation 
{

     // FUNCTION (CHECK NUMBER IS ODD OR EVEN)
     public static void oddOreven(int n)
     {
          int bitMask = 1;
          if((n & bitMask) == 0)
          {
               System.out.println("even number");
          }
          else
          {
               System.out.println("odd number");
          }
     }

//   FUNCTION( 1.GET ITH BIT)
     public static int get_ith_bit(int n, int i)
     {
          int bitMask = 1<<i;
          if((n & bitMask) == 0)
          {
               return 0;
          }
          else{
               return 1;
          }
     }

//   FUNCTION (2. SET ITH BIT)
     public static int set_ith_bit(int n, int i)
     {
          int bitMask = 1<<i;
          return n | bitMask;
     }

 //   FUNCTION (3.CLEAR ITH BIT)
     public static int clear_ith_bit(int n, int i)
     {
          int bitMask = ~(1<<i);
          return n & bitMask;  
     }



     public static void main(String[] args)
      {     //BIT-WISE OPERATOR
         //BINARY AND (both same then rerurn true)
        System.out.println(5 & 6);
         //BINARY OR
        System.out.println(5 | 6);
         //BINARY XOR(both diffrent then return true)
        System.out.println(5 ^ 6);
         //BINARY ONE's COMPLEMENT(not opretor)
        System.out.println(~5);
         //BINARY LEFT SHIFT(FORMULA (a<<b = a * 2^b))
        System.out.println(5<<2);
         //BINARY RIGHT SHIFT(FORMULA (a>>b = a / 2^b))
        System.out.println(6>>1);
   
  
        // FUNCTION (CHECK NUMBER IS ODD OR EVEN)
        oddOreven(3);
        oddOreven(6);

    
        // FUNCTION(GET ITH BIT)
        System.out.println(get_ith_bit(10,2));
      
        //   FUNCTION (2. set ITH BIT)
        System.out.println( set_ith_bit(10,2));

        //   FUNCTION (3.CLEAR ITH BIT)
        System.out.println( clear_ith_bit(10,1));

      }


}
