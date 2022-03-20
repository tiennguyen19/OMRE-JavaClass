package encapsulate;

public class Employee {
    private int id;
    private String firstName, lastName;
    private int salary;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setSalary(int salary){
        System.out.println("salary = "+salary);
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public double raiseSalary(double percent){
        return salary+salary*percent;
    }

    public String toString(){
        return "Employee_ID [id= "+id+", name = "+firstName+" "+lastName+", salary = "+salary+"]";
    }
}
