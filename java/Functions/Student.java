
public class Student {
    String username;
    String email;
    int age;
    Student(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    Student(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    Student(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    Student(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
