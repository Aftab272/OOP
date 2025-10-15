public class App {
    public static void main(String[] args) throws Exception {
               Employee emp1 = new Employee(101, "Alice Johnson", 55000);
        Employee emp2 = new Employee(102, "Bob Smith", 60000);
        Employee emp3 = new Employee(103, "Charlie Brown", 50000);
        emp2.setSalary(65000);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();

    
        System.out.println("All employees work at: " + Employee.companyName);
    }
}

  
