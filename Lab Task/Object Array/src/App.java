public class App {
    public static void main(String[] args) throws Exception {
        Employee[]employee ={new Employee("Ali",50000),
        new Employee("Ali",75000),
        new Employee("Ali",65000),
        new Employee("Ali",80000),
        new Employee("Ali",60000)
    };

    Employee highest = employee[0];
    for (Employee e :employee){
        if (e.salary > highest.salary){
            highest = e;
        }
         Employee lowest= employee[0];
    for (Employee e1 :employee){
        if (e.salary < lowest.salary){
            lowest = e1;
        }
    }
      System.out.println("Highest Paid:" + highest.name+"with salary"+highest.salary);
       System.out.println("Lowest Paid:" + lowest.name+"with salary"+lowest.salary);
    }
}
}