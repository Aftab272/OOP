public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked) {
        super(first, last, ssn);
        wage = hourlyWage;
        hours = hoursWorked;
    }

    public double earnings(){
        if (hours <= 40)
            return wage * hours;
        else
            return 40* wage + (hours - 40) * wage * 1.5;
    }
}
