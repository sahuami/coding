import java.util.ArrayList;

public class o4_pairSUM {

    // FIND IF ANY PAIR IN A SORTED ARRAYLIST HAS A TARGET SUM
    public static boolean pairSum1(ArrayList<Integer> list, int target) {

        // // BRUTE APPROACH(this approach are any arraylist like
        // sorted/unsorted/rotated)
        // for (int i = 0; i < list.size(); i++) {
        // for (int j = i + 1; j < list.size(); j++) {
        // if (list.get(i) + list.get(j) == target) {
        // return true;
        // }

        // }
        // }
        // return false;

        // 2 pointer approach
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }

        }
        return false;
    }

    // FIND IF ANY PAIR IN A SORTED and rotated ARRAYLIST HAS A TARGET SUM
    public static boolean pairSum2(ArrayList<Integer> list, int Target) {
       int bp = -1;
       int n = list.size();
       for(int i=0; i<list.size();i++){
        if(list.get(i) > list.get(i+1)){ //breaking point
             bp = i;
             break;
        }
       }
        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == Target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < Target) {
                lp = (lp+1)%n;
            } else {
                // case 3
                rp = (n+rp-1) % n;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list, target));

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        int Target = 16;
        System.out.println(pairSum2(list1, Target));
    }
}
