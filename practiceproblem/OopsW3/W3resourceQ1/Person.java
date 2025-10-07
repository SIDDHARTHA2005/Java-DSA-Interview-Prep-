package practiceproblem.OopsW3.W3resourceQ1;

/*
// Method 1
public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
*/

//Method 2
public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // set methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //get methods
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}