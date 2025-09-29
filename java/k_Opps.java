
// object : entities in the real world
// classes : group of these entities

public class k_Opps {
    public static void main(String[] args) {

        // created a pen object called p1
        Pen p1 = new Pen();
        p1.color = "white"; // color ko dono tarike se set kr skte eai
        System.out.println(p1.color);
        p1.tip = 8;
        System.out.println(p1.tip);

        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "amitsahu";
        System.out.println(myAcc.username);
        // myAcc.password = "asdfgghfd"; //this show error bcz we set password privately
        myAcc.setPassword("sdfghjkl");
        // System.out.println(myAcc.setPassword);  jb hum kisse data types ko private
        // krte hai toh usko hum ussi class se access kr skte hai jis class me humne
        // usse private kiya hai main function se hum usko access nhi kr skte

        // create pencil object called named p2
        Pencil p2 = new Pencil();
        p2.setColor("black");
        System.out.println(p2.getColor());
        p2.setSize(2);
        System.out.println(p2.getSize());

        // Student s1 = new Student();
        // Student s2 = new Student("amit");
        // Student s3 = new Student(123);

        // COPY CONSTRUCTOR(SHALLOW)
        // Student s1 = new Student();
        // s1.name = "amit";
        // s1.roll = 123;
        // s1.password = "abcd";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;

        // // create Student object called named s2
        // Student s2 = new Student(s1);
        // s2.password = "xyz";
        // s1.marks[2] = 100;
        // for (int i = 0; i < 3; i++) {
        // System.out.println(s2.marks[i]);
        // }
    }

}

// create pen class
class Pen {
    String color;
    int tip;

    // these two are the function of pen jiski wajah se hum apne color or tip ko
    // change(set) kr skte hai

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;

    }
}

// ACCESS MODIFIER
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pssword) {
        password = pssword;
        System.out.println(password);
    }
}

// getter(to return the value) and setter(to modify the value)
class Pencil {
    private String color; // private banane se hum direct access ni kr skte par get or set ki help se kr
                          // skte hai
    private int size;

    String getColor() {
        return this.color;
    }

    int getSize() {
        return this.size;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setSize(int size) {
        this.size = size; // 'this' keyword is used to refer to the current object

    }
}
