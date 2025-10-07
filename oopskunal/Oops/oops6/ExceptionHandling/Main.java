package oopskunal.Oops.oops6.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // int c = a / b;
        String name = "Sid";
        try {
        if(name.equals("Sid")){
            throw new MyException("Your name is Sid via my own Exception");
        }

        // System.out.println(c);

            // int c = a / b;
            divide(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always run");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Don't divide it by zero");
        }
        return a / b;
    }
}
