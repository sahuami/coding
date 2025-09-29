public class k1_Constructor {
  public static void main(String[] args) {

    Student s1 = new Student();
    Student s2 = new Student("sahami");
    System.out.println(s2.name);
    Student s3 = new Student(123, 1);
    System.out.println(s3.roll + " " + s3.id);

    s1.name = "amit";
    System.out.println(s1.name);
    s1.roll = 21;
    System.out.println(s1.roll);
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;

    Student s4 = new Student(s1);
    s1.marks[2] = 100;
    for (int i = 0; i < 3; i++) {
      System.out.println(s4.marks[i]);
    }
    System.out.println(s4.password);
  }
}

// CONSTRUCTOR: {A constructor in Java is a special method that is used to
// initialize objects. The constructor is called when an object of a class is
// created. It can be used to set initial values for object attributes}
// 1.All classes have constructors by default: if you do not create a class
// constructor yourself, Java creates one for you. However, then you are not
// able to set initial values for object attributes.
// 2.constructor name must match the class name, and it cannot have a return
// type
// 3.Memory allocation happens when constructor is called
// 4.Constructor are only called once,at object creation

class Student {
  String name;
  int roll;
  int id;
  int marks[];
  int password;

  // NOTE: agar hum koi contructor crete ni krte toh java automatically kud ka
  // default constructor create kr deta hai

  // create contructor
  // TYPES (non parameterized contructor)
  Student() {
    marks = new int[3];
    System.out.println("constructor is called");
  }

  // create( parameterized contructor)
  Student(String name) {
    this.name = name;
    // marks = new int[3];
  }

  Student(int roll, int id) {
    this.roll = roll;
    this.id = id;
    // marks = new int[3];
  }

  // (c++ ke andar copy contructor by default milta bs java ke andar hame copy
  // contructor create krna hota hai)

  // create (copy contructor(Swallow: changes reflect) )
  // Student(Student s1) {
  // marks = new int[3];
  // this.name = s1.name;
  // this.roll = s1.roll;
  // this.marks = s1.marks;
  // this.password= 123;
  // }

  // (deep copy constructor : changes don't reflect)
  Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for (int i = 0; i < marks.length; i++) {
      this.marks[i] = s1.marks[i];
    }
      this.password= 123;

  }
}


// Destructor : java ke andar hame desctructor nhi bnana padta vo kaam java ka garbage collector kr deta hai magar c++ me hame destructor bnana hota hai
                  //  (garbage collector usused object, variable ya phir or bhi kuch jo used nhi ho rah code m usko automatic delete kr deta hai)