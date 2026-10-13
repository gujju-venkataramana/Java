class Employee
{
    String name, designation;
    int id;
    double salary;
    boolean promotionStatus;
    Employee(String name, int id)
    {
        this(name, id, "Trainee", 18000, false);
    }
    Employee(String name, int id, String designation, double salary, boolean promotionStatus)
    {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }
    void display()
    {
        System.out.println("Name: " + name + ", ID: " + id);
        System.out.println("Designation: " + designation + ", Salary: " + salary);
        System.out.println("Promoted: " + promotionStatus + "\n");
    }
}
public class EmployeeConstructorOverloading
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Ravi", 101);
        Employee e2 = new Employee("Priya", 102, "Developer", 42000, true);
        e1.display();
        e2.display();
    }
}
