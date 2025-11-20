public class App {
    public static void main(String[] args) throws Exception {
        SalariedEmployee salariedEmployee = new SalariedEmployee ("John","Smith","111-11-1111", 800.00);

        HourlyEmployee hourlyEmployee= new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 ); 

        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-44444", 5000.0, 0.04, 300.0);

        Employee[] employees = new Employee[ 4 ]; 
            employees[ 0 ] = salariedEmployee; 
            employees[ 1 ] = hourlyEmployee; 
            employees[ 2 ] = commissionEmployee; 
            employees[ 3 ] = basePlusCommissionEmployee; 
for (int i=0; i<4 ;i++) {

    System.out.println(employees[i].earnings());

}
}
}
