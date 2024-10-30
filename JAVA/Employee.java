import java.util.Scanner;

public class Employee {
	public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int eId;
		String eName;
		double eSalary;

                System.out.println("Enter the value of Employee Id: ");
                eId = sc.nextInt(); 
                System.out.println("Enter the value of Employee Name: ");
                eName = sc.next();
                System.out.println("Enter the value of Employee Salary: ");
                eSalary = sc.nextDouble(); 

                System.out.println("Employee Id: " + eId);
                System.out.println("Employee Name: " + eName);
                System.out.println("Employee Salary: " + eSalary);
	}
}