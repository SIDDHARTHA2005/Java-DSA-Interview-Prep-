package practiceproblem.OopsW3.W3resourceQ6;

public class Employee {
    private String name;
    private String job_title;
    private double salary;

    public Employee(String name, String job_title, double salary){
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public Employee(){
        this.name = "Sid";
        this.job_title = "SDE1";
        this.salary = 2500000.0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getJob_title() {
        return job_title;
    }
    public double getSalary() {
        return salary;
    }

    //Methods to update salary
    public void update_salary(double percentage){
        salary = (salary * (percentage/100)) + salary;
    }
}
