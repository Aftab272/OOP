public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double salary){
        super (first, last,  ssn );
        weeklySalary = salary;
    }
    public double earnings(){
        return weeklySalary;
    }

    
}

