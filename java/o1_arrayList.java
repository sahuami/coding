import java.util.ArrayList;

public class o1_arrayList {

    

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(3);
      
        // size of arraylist
        System.out.println(list.size());
       
        // print of arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print reverse of an arraylist
        for(int i=list.size()-1; i>=0; i--){
         System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print maximum of arraylist
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("max element=" + max);


    }
}