package oopskunal.Oops.oops6.ObjectCloning;

public class Main {
    public static void main(String[] args) {
        Human Nipuna = new Human(21,"Nipuna");
        System.out.println(Nipuna.age);
        System.out.println(Nipuna.age);
        Human twin = new Human(Nipuna);
    }
}
