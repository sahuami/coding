import java.util.ArrayList;

public class o_arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // OPERATIONS
        // add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(1,9);
                System.out.println(list);


        // get operation
        int element = list.get(2);
        System.out.println(element);

        // remove operation
        list.remove(3);
        System.out.println(list);

        // set operation
        list.set(2, 10);
        System.out.println(list);

        // contain element
        System.out.println((list.contains(1)));
        System.out.println((list.contains(11)));

    }
}
