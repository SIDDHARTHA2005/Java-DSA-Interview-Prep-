package oopskunal.Oops.abstraction.example1;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        System.out.println(son.age);    // son age is 25
        System.out.println(son.VALUE);  // final value is 20
        son.career("Engineer");
        son.partner("Nipuna", 21);
        son.fun();
    
        
        Daughter daughter = new Daughter(22);
        System.out.println(daughter.VALUE);
        daughter.career("Fashion Designer");

        Parent.hello();
    }
}
