import java.util.Scanner;
interface Payroll
{
    void displaySalary();
}
class RegularEmployee implements Payroll
{
    public void displaySalary()
    {
        int basic = 25000, hra = 15000, ta = 5000;
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic + " HRA: " + hra + " T.A: " + ta);
        System.out.println("Total Amount: " + (basic + hra + ta));
    }
}
class ContractEmployee implements Payroll
{
    public void displaySalary()
    {
        int basic = 12000, hra = 0, ta = 3000;
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic + " HRA: " + hra + " T.A: " + ta);
        System.out.println("Total Amount: " + (basic + hra + ta));
    }
}
public class EmployeePayrollInterface
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id (R101 or C101): ");
        String id = sc.nextLine().trim().toUpperCase();
        Payroll employee;
        if (id.startsWith("R")) employee = new RegularEmployee();
        else if (id.startsWith("C")) employee = new ContractEmployee();
        else
        {
            System.out.println("Invalid employee ID");
            sc.close();
            return;
        }
        employee.displaySalary();
        sc.close();
    }
}
