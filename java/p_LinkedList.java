   
public class p_LinkedList {
    // create class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step 1: create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2: newNode next = head
        newNode.next = head;
        // step3: head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step 1: create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        // step3: head = newNode
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL if empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL if empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int recursionSerach(int key) {
        return helper(head, key);
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int siz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            siz++;
        }

        if (n == siz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iTofind = siz - n;
        Node prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
    
        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
            if(slow == fast){
                return true;  //cycle exist
            }
        }
        return false;  // cycle does not exist
       }

    public static void main(String[] args) {
        p_LinkedList ll = new p_LinkedList();
        ll.print();
        ll.addFirst(3);
        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addLast(4);
        ll.print();

        ll.addLast(5);
        ll.print();

        ll.addLast(6);
        ll.print();

        ll.add(2, 9);
        ll.print();

        System.out.println("size of linked list is : " + ll.size);

        ll.removeFirst();
        ll.print();
        System.out.println("size of linked list is : " + ll.size);

        ll.removeLast();
        ll.print();
        System.out.println("size of linked list is : " + ll.size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

        System.out.println(ll.recursionSerach(3));

        ll.reverse();
        ll.print();

        ll.deleteNthfromEnd(2);
        ll.print();

        System.out.println(isCycle());

    }

}
