package oopskunal.Oops.oops6.LambdaFuntion;
import java.util.ArrayList;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr.add(i + 1);
        }
        
        //Lambda Expression using for-each loop
        arr.forEach((item) -> System.out.println(item * 2));

        // Using Lambda function
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation pro = (a, b) -> a * b;

        LambdaExpression myCal = new LambdaExpression();
        System.out.println(myCal.operate(5,4,sum));
        System.out.println(myCal.operate(5,4,sub));
        System.out.println(myCal.operate(5,4,pro));

    }    

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}
interface Operation {
    int operation(int a, int b);
}
