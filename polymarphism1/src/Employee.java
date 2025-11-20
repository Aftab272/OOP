public abstract class Employee {
  private String firstName;
  private String lastName;
  private String socialSecurityNumber;
  
  public Employee(String first, String last, String ssn){
    firstName = first;
    lastName = last;
    socialSecurityNumber = ssn;

  }
  public String toString(){
    return String.format("%s %s\nsocial security number: %s", firstName, lastName, socialSecurityNumber);
  }
  public abstract double earnings(); 

    
    
}
