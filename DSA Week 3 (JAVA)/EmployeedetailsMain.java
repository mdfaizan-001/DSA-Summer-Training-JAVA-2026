class Employee {
    String empName;
    int empId;
    String phoneNo;
    void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Phone No: " + phoneNo);
    }
}
public class EmployeedetailsMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empName = "Faizan";
        e1.empId = 101;
        e1.phoneNo = "9876543210";
        e1.display();
    }
}
