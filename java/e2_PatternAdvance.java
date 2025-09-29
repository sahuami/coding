public class e2_PatternAdvance 
{
 
 //FUNCTION 1(HOLLOW RECTANGLE)
    public static void hollow_rectangle(int totRows, int totCols)
 {
    //outer loop
    for(int i=1; i<=totRows; i++)
    { //inner loop
      for(int j=1; j<=totCols; j++)
      if(i==1|| i==totRows|| j==1|| j==totCols)
      {
        System.out.print("*");
      }
      else
        { System.out.print(" ");
        }
    
    System.out.println();
    }   
 }


 //FUNCTION 2(INVERTED & ROTATED HALF PYRAMID)
 public static void inverted_rotated_half_pyramid(int rows)
 {
    for( int i=1; i<=rows; i++)
    {  //spaces
        for(int j=1; j<=rows-i;j++)
        {
        System.out.print(" ");
        }
       
       //stars fo
       for(int j=1; j<=i; j++)
       {
        System.out.print("*");
       }
       System.out.println();
    }
 }


 //FUNCTION 3(INVERTED HALF_PYRAMID WITH NUMBER)
  public static void inverted_half_pyramid_with_number(int Rows)
  {
   for(int i=1; i<=Rows; i++)
   {
    for(int j=1; j<=Rows-i+1; j++)
    {
        System.out.print(j);
    }
    System.out.println();
   }

  }


 //FUNCTION 4(FLOYDS TRIANGLE)
 public static void floyds_triangle(int Rows)
 {int counter = 1;
  for(int i=1; i<=Rows; i++)
  {
   for(int j=1; j<=i; j++)
   {
       System.out.print(counter+" ");
       counter++;
   }
   System.out.println();
  }

 }
  

 //FUNCTION 5(0/1 TRIANGLE)
 public static void zero_one_triangle(int rows)
 {
    for(int i=1; i<=rows; i++)
    {
        for(int j=1; j<=i; j++)
        {
            if((i+j)%2==0)
            {
                System.out.print("1");
            }
                else
                {
                    System.out.print("0");
                }
            
        }
        System.out.println();
    }
 }


 //FUNCTION 6(BUTTERFLY)
public static void butterfly(int rows)
{//1st half
    for(int i=1; i<=rows; i++)
    {//stars
        for(int j=1; j<=i; j++)
        {
           System.out.print("*");
        }
   
     //space
    for(int j=1; j<=2*(rows-i); j++)
    {
        System.out.print(" ");
    }
   
    //stars
      for(int j=1; j<=i; j++)
    {
       System.out.print("*");
    }
    System.out.println();
}

  //2nd half
   for(int i=rows; i>=1; i--)
     {//stars
        for(int j=1; j<=i; j++)
        {
           System.out.print("*");
        }
   
     //space
    for(int j=1; j<=2*(rows-i); j++)
    {
        System.out.print(" ");
    }
   
    //stars
      for(int j=1; j<=i; j++)
    {
       System.out.print("*");
    }
    System.out.println();
}
    
}


//FUNCTION 7(SOLID RHOMBUS)
public static void solid_rhombus(int rows)
{
   for(int i=1; i<=rows; i++)
   {//spaces
    for(int j=1; j<=(rows-i); j++)
    {
       System.out.print(" ");
    }

    //stars
    for(int j=1; j<=rows; j++)
    {
        System.out.print("*");
    }
   
   System.out.println();
}
}

public static void hollow_rhombus(int rows)
{
    for(int i=1; i<=rows; i++)
    {
    //spaces
     for(int j=1; j<=(rows-i); j++)
     {
        System.out.print(" ");
     }
     
// hollow rhombus -stars
for(int j=1; j<=rows; j++)
{
    if(i==1|| i==rows|| j==1|| j==rows )
    {
        System.out.print("*");
    }
    else
    {
        System.out.print(" ");
    }
}
        System.out.println();
    }
}


 //FUNCTION 8(DIAMOND)
 public static void diamond(int rows)
 {//1st half
    for(int i=1; i<=rows; i++)
    {//spaces
        for(int j=1; j<=(rows-i); j++)
        {
          System.out.print(" ");
        }
     //star
      for(int j=1; j<=(2*i)-1; j++)
      {
        System.out.print("*");
      }
      System.out.println();

    }
    for(int i=rows; i>=1; i--)
    {//spaces
        for(int j=1; j<=(rows-i); j++)
        {
          System.out.print(" ");
        }
     //star
      for(int j=1; j<=(2*i)-1; j++)
      {
        System.out.print("*");
      }
      System.out.println();

    }
    
 }



public static void main(String[] args)
 {
     //FUNCTION 1(HOLLOW RECTANGLE)
        hollow_rectangle(4, 5);
       System.out.println();
     //FUNCTION 2(INVERTED & ROTATED HALF PYRAMID)
     inverted_rotated_half_pyramid(4);
     System.out.println();

     //FUNCTION 3(INVERTED HALF_PYRAMID WITH NUMBER)
       inverted_half_pyramid_with_number(4);
        System.out.println();

     //FUNCTION 4(FLOYDS TRIANGLE)
     floyds_triangle(4);
      System.out.println();

     //FUNCTION 5(0/1 TRIANGLE)
      zero_one_triangle(4);
        System.out.println();
   
   //FUNCTION 6(BUTTERFLY)
    butterfly(4);
    System.out.println();

    //FUNCTION 7(SOLID RHOMBUS)
     solid_rhombus(4);
     System.out.println();

     //FUNCTION 7(HOLLOW RHOMBUS)
       hollow_rhombus(4);
       System.out.println();

     //FUNCTION 8(DIAMOND)
       diamond(4);

}}