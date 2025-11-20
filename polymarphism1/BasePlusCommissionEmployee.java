public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String first,String last, String ssn, double sales, double rate, double salary){
       super( first, last,ssn, sales,rate);
       baseSalary = salary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    public double earnings(){
        return baseSalary + super.earnings();
    }
    
}
