package oopskunal;

// 1. Create a class messageprinter with a method printMessage(String name) which prints the message "hello <name>".
    /*
public class practice {
    public static void main(String[] args) {
        Messageprinter mp = new Messageprinter();
        mp.printMessage("Hukka");
    }
}
    class Messageprinter{
        void printMessage(String name){
            System.out.println("Hello"+name);
    }
}
*/
/*
// print from oops2.java
public class practice{
    String name;
    int age;
    int salary;
    boolean martialstatus;
    static long population;

    public practice(String name, int age, int salary, boolean martialstatus){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.martialstatus = martialstatus;

        practice.population += 1;
    }
}
    */

    /*
    public class practice{
        static int a = 10;
        static int b;
        // will only run once , when the first object is created or the first time a static member is accessed
        static void message(){
            System.out.println("Hello World");
            b = a*4;
        }
        public static void main(String[] args) {
            practice obj = new practice();
            message();
            System.out.println(practice.a + " " + practice.b);

            practice.b += 10;
            System.out.println(practice.a + " " + practice.b);
        }
    }
        */
/*
        class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
public class practice{
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Rahul");
        Test b = new Test("Sid");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
    */

    // oops3.java
    // box example - inheritance
    public class practice {
        public static void main(String[] args) {
            // oops3 box1 = new oops3(5.0,4.0,8.0);
            // boxweight box2 = new boxweight(4.2, 7.7, 7.2, 9.0);
            
            // System.out.println(box1.l + " " + box1.h + " " + box1.w);
            // System.out.println(box2.l + " " + box2.weight);

            oops3 box5 = new boxweight(5,4,7,9);
            System.out.println(box5);           // output shows me a random hash code of the object
            System.out.println(box5.l + " " + box5.h + " " + box5.w);
            // weight is not available because refrence is of parent class

            // boxweight box6 = new oops3(2.2,4.4,5.2,6.3);
            // this will give error because parent class object cannot be referred by child class reference
            // System.out.println(box6.l + " " + box6.h + " " + box6.w + " " + box6.weight);

        }
    }
