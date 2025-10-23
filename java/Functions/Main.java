// import java.util.Scanner;

//                              Methods
// public class java{
//     public static void main(String args[]){
//         int age;
//         String name;
//         happyBirthday("Ben", 20);
//     }

//     static void happyBirthday(String name, int age){
//         System.out.printf("Happy Birthday %s\n", name);
//         System.out.println("May God Bless youu");
//         System.out.printf("You are %d years old!!", age);
//         }
// }


// public class java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         System.out.println(square(num1, num2));
//     }
//     static double square(int num1, int num2){
//         return num1 * num2;
//     }
// }


// public class java{
//     public static void main(String args[]){
//         System.out.println(fullName("Mickey", "Mouse"));
//     }
//     static String fullName(String firstName, String lastName){
//         return firstName + " " + lastName;
//     }
// }


// public class java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.println("Your age is Valid(true)/Invalid(false): " + ageCheck(age));
//     }
//     static boolean ageCheck(int age){
//         return age>=18;
//     }
// }

//                             Method Overloading

// public class java{
    // public static void main(String args[]){
    //     System.out.println(add(1.3, 2.9));
    // }
    // static double add(double a, double b){
    //     return a+b;
    // }
    // static int add(int a, int b){
    //     return a+b;
    // }

    //Output : 1 2
    // static int x = 3;
    // public static void main(String args[]){
    //     int x = 1;
    //     System.out.println(x);
    //     doIt();
    // }

    //     static void doIt(){
    //         int x = 2;
    //         System.out.println(x);
    // }
// }


// Mini Project - Banking Problem

// public class java{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         double balance = 5000;
//         System.out.println("---------------------");
//         System.out.println(balance);
//         System.out.println("---------------------");
//         System.out.println("Banking Program");
//         System.out.println("---------------------");

//         while(true){
//         System.out.println("1. Show Balance");
//         System.out.println("2. Deposit");;
//         System.out.println("3. Withdraw");
//         System.out.println("4. Exit");
//         System.out.println("---------------------");
//         System.out.print("Enter your choices: ");
//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println(balance);
//                 break;
//             case 2:
//                  System.out.println("Please enter the amount for deposit:");
//                  double deposit = sc.nextDouble();
//                  balance = balance + deposit;
//                 break;
//             case 3:
//                  System.out.println("Please enter the amount for withdrwal:");
//                  double withdrawal= sc.nextDouble();
//                  if (balance<0) {
//                     System.out.println("Insufficient Amount");
//                  } else {
//                  balance = balance - withdrawal;
//                  }
//                  break;
//             case 4:
//                  System.out.println("Quiting from your account...");
//                  break;
//             default:
//                  System.out.println("You entered the wrong number");
//                  System.out.println("Please try again!!!");
//                 break;
//         }
//         System.out.println("---------------------");
//         System.out.println("Updated balance: %d", balance);
//         System.out.println("---------------------");

//         sc.close();
//     }
//     }
// }


//                       Object Oriented Programming (OOPs Concept)

// import java.util.Scanner;

// public class main{
//     public static void main(String args[]){ 
//         // Car car = new Car();
//         // Bike bike = new Bike();
        
//         // System.out.println(bike.name);
//         // System.out.println(bike.model);
//         // System.out.println(car.name);
//         // System.out.println(car.model); 

//         Student user1 = new Student("Bob");
//         Student user2 = new Student("Kalyan", "Kstar@gmail.com");
//         Student user3 = new Student("Charan", "Charan@gmail.com", 35);
//         Student user4 = new Student();

//         System.out.println(user1.username);
//         System.out.println(user1.email);
//         System.out.println(user1.age);

//         System.out.println(user2.username);
//         System.out.println(user2.email);
//         System.out.println(user2.age);

//         System.out.println(user3.username);
//         System.out.println(user3.email);
//         System.out.println(user3.age);
//     }
// }



// public class main{
//     public static void main(String args[]){

                                //Encapsulation

        // Car car = new Car("Toyota", "Fortuner", 2024);

        // car.setMake("BMW");

        // System.out.println(car.getMake());
        // System.out.println(car.getModel());
        // System.out.println(car.getYear());

                                //Arrays

        // Car car1 = new Car("Red", "Mustang");
        // Car car2 = new Car("Black", "BMW");
        // Car car3 = new Car("White", "Fortuner");

        // Car[] cars = {car1, car2, car3};

        // for(int i=0; i< cars.length; i++){
        //     cars[i].drive();
        // }

//         Car friend1 = new Car("Bobu");
//         Car friend2 = new Car("Ram");
//         Car friend3 = new Car("Shiv");
//         Car friend4 = new Car("Maha");

//         System.out.println(friend1.numOfFriends);
//     }
// }

//Inheritance

public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

    }
}