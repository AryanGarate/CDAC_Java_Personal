package in.com;

public class Employee {
    
	   
    public void displayInfo(int employeeId) {
        System.out.println("Employee ID: " + employeeId);
    }
    
    
    public void displayInfo(double salary) {
        System.out.println("Salary: $" + salary);
    }
    
    // Overloaded method with String parameter
    public void displayInfo(String employeeName) {
        System.out.println("Employee Name: " + employeeName);
    }
    
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        employee.displayInfo(101);
        employee.displayInfo(50000.00);
        employee.displayInfo("Aryan Garate");
    }
}
