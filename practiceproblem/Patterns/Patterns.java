package practiceproblem.Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern30(5);
    }


static void pattern1(int n){
    for(int i = 1; i <= n; i++){               // rows       *
        for(int j = 1; j <= i; j++){           // columns    * *
            System.out.print("* ");          //            * * *
        }                                      //            * * * *
        System.out.println();
        }
    }


    static void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i = n; i > 0 ; i--){
            for(int j = i; j > 0; j--){ 
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        int a =  n/2 + 1;       // 9/2 = 4 + 1 = 5
        for(int i = 1; i <= n; i++){
            if(i <= a){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        } else if(i > a) {
            a--;
            for(int j = 0; j < a; j++) {
                System.out.print("* ");
            }
        }
            System.out.println();
        }
    }

    static void pattern28(int n){
        // upper half
        int a = n/2;    //4
        for(int i = 0; i <= a; i++){
            for(int j = a; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for(int i = 1; i <= a; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = a; k >= i; k--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int i = 1; i <= n; i++) {
            for(int j = n-1; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }
            for(int l = 2; l <= i; l++){
                System.out.print(l) ;
            }
            System.out.println();
        }
    }
}
