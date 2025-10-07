// import java.util.Scanner;

// public class main{
//     public static void main(String args[]){

        //variable = a reusable container for a value
        //           a variable behaves as if it was the value it contains

        //Primitive = simple value 
        // int age = 20;
        // int year = 2025;
        // int quantity = 2;

        // float cost = 99.99f;

        // double price = 19.99;
        // double tgpa = 6.5;
        // double cgpa = 7;
        
        // char grade = 'B';
        // char symbol = '!';
        // char currency = '$';

        // boolean isStudent = true;
        // boolean forSale = false;
        // boolean isOnline = true;

        // if(isStudent){
        //     System.out.println("You are a \nstudent!");
        // } else {
        //     System.out.println("You are not a student!");
        // }

        // float maxScore = 25f;
        // float userScore = 2.5f;
        // int percentage = (int) (maxScore/userScore);
        // System.out.println(percentage);

        // int x = 5;
        // for(int a=10;x<a;--a){
        //     System.out.println(x);
        //     System.out.println(a);
        //     }

        // String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // System.out.println("The length of the string is " + txt.length()+".");

        // String firstName = "Don";
        // String lastName = "Lee";
        // System.out.println(firstName + " " + lastName);
        // System.out.println(firstName.concat(lastName));

        //System.out.println(Math.min(5, 10));

        //Switch Case

        // Scanner sc = new Scanner(System.in);
        // int firstNum, secondNum;
        // char operation;
        // System.out.println("Enter your first number: ");
        // firstNum = sc.nextInt();
        // System.out.println("Enter your second number: ");
        // secondNum = sc.nextInt();
        // System.out.println("Enter operation(+, -, *, /)");
        // operation = sc.next().charAt(0);

        // switch (operation){
        //     case '+':
        //     System.out.println(firstNum + secondNum);
        //     break;
        //     case '-':
        //     System.out.println(firstNum - secondNum);
        //     break;
        //     case '*':
        //     System.out.println(firstNum * secondNum);
        //     break;
        //     case '/':
        //     System.out.println(firstNum / secondNum);
        //     break;
        //     default:
        //     System.out.println("You opted the wrong operation symbol");
        // }

        //while and do while loop

        // int countdown = 10;

        // while(countdown>0){
        //     System.out.println(countdown);
        //     countdown--;
        // }
        // System.out.println("Happy New Year!!");

        // int dice = 1;
        // while (dice<=6) {
        //     if (dice<6) {
        //         System.out.println("No Yatzy.");
        //     } else {
        //         System.out.println("Yatzy");
        //     }
        //     dice = dice + 1;
        // }

        // for loop
        //for(int i = 0; i<5; i++){
        //    System.out.println(i);
        //}

        //Mutiplication table
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Which mutiplication table do you need?");
        // int digit = sc.nextInt();
        // int ans;
        // for(int i = 1; i<=10; i++){
        //     ans = i*digit;
        //     System.out.println(i + " x " + digit + " = " + ans);
        // }

        // int ages[] = {10,20,25,30,35,40,45,50,55,60};
        // int sum = 0;
        // for(int age : ages){
        //     sum = sum + age;
        // }
        // int avg = sum/ages.length;
        // System.out.println("Average age is : " + avg);
//     }
// }

//Ecapsulation Using Getter and Setter

// public class Car{
//     private String make;
//     private String model;
//     private int year;

//     Car(String make, String model, int year){
//         this.setMake(make);
//         this.setModel(model);
//         this.setYear(year);
//     }

//     public  String getMake(){
//         return make;
//     }

//     public String getModel(){
//         return model;
//     }

//     public int getYear(){
//         return year;
//     }

//     public void setMake(String make){
//         this.make = make;
//     }
//     public void setModel(String model){
//         this.model = model;
//     }
//     public void setYear(int year){
//         this.year = year;
//     }
// }

// public class Car{
    // String color;
    // String model;

    //                     //Arrays
    // Car(String color, String model){
    //     this.color = color;
    //     this.model = model;
    // }

    // void drive(){
    //     System.out.println("You can drive this "+ this.color+" "+ this.model);
    // }


//     static int numOfFriends;
//     String name;

//     Car(String name){
//         this.name = name;
//         numOfFriends++;
//     }
// }

