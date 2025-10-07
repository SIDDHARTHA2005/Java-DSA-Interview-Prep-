package oopskunal.Oops.oops6.Generics.Comparing;

public class Main {
    public static void main(String[] args) {
        Student Siddhu = new Student(57, 68.92f);
        Student Nipuna = new Student(13, 82.12f);

        if(Nipuna > Siddhu){
            System.out.println("She scored more marks");
        }
    }
}
