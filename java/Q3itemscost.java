import java.util.*;
public class Q3itemscost {
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalcost= pencil+pen+eraser;
        System.out.println("total cost are"+totalcost);
        
        float  newtotal = totalcost + (0.18f*totalcost);

        System.out.println("total cost include gst"+newtotal);
    }



}

