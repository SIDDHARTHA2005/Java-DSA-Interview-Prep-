package practiceproblem.OopsW3.W3resourceQ6;

// Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.


public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Nipuna","HR",1500000.0);

        System.out.println(emp1.getName());
        System.out.println(emp1.getJob_title());
        System.out.println(emp1.getSalary());

        emp1.update_salary(10);
        emp2.update_salary(5);
        System.out.println("Name: " + emp1.getName() + " and his salary is increased by 10% : " + emp1.getSalary());
        System.out.println("Name " + emp2.getName() + "and her salary is increased by 5% : " + emp2.getSalary());

    }
}
