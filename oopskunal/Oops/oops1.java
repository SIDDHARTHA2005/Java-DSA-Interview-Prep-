package oopskunal;

public class oops1{
    public static void main (String[] args){
        // Student[] students = new Student[5];
        Student sid = new Student(12,"Siddhartha",88.2f);   
        Student rahul = new Student(15,"Rahul Tripathi",66.2f);
        Student preethi = new Student(22,"Preethi Reddy",77.2f);
        Student mad = new Student(); //Student() is a contructor
        Student random = new Student(sid);
        Student random2 = new Student();
        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);
        System.out.println(random2.name);
        // sid.changeName("Jas");

        // sid.rollno = 39;
        // System.out.println(sid.rollno);
        // System.out.println(sid.name);
        // System.out.println(sid.marks);
        sid.greetings();
        rahul.greetings();

        sid.display();
        rahul.display();
        preethi.display();
        mad.display(); // constructor overloading

        // System.out.println(Arrays.toString(students));

        // final A max = new A("maximin");
        // max.name = "other_name";

        // when a non primitive is final, you cannot reassign it 
        // max = new A("new object");
    }
}
    class Student{
        int rollno;
        String name;
        float marks;

        void changeName(String name){
            this.name = name;          
        }

        void greetings(){
            System.out.println("Hello!, I am " + this.name);
        }

        Student (Student other){
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;
        }

    //      Student(){
    //         this.rollno = 5;
    //         this.name = "madmax";
    //         this.marks = 55.5f;
    // }

    Student(){
        // this is how you call a constructor from another constructor
        // internally: new Student(22,"Random_Person",100.0f);
        this(22,"Random_Person",100.0f);
    }

    // Student arpit = new Student(44, "arpit" ,87.9f);
    // here this will replaced by the name arpit
        Student(int rollno, String name, float marks){
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+marks);
    }

    // wrapper class
    class A {
        final int num = 10;
        String name;
        public A (String name){
            this.name = name;
        }
    }
}