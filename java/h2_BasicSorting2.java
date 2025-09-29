import java.util.Arrays;
public class h2_BasicSorting2 
{

 public static void printArr(int Arr[])
{
    for (int i=0; i<Arr.length; i++)
    {
      System.out.print(Arr[i]+" ");
    }  
      System.out.println();
}

public static void main(String[] args)
 {
int Arr[] = {6,5,8,7,2};
//Arrays.sort(Arr);    INBUILT SORT (isme hume sorting algo ni likhni hoti ye likh (Arrays.sort(Arr);) kr hum array ko sort kr skte hai or import java.util.Arrays; likhna jaruri hai )
Arrays.sort(Arr,0,2);   //(isse hum jitne chahe utne index tk sort kr skte hai)
 printArr(Arr);
}

}
