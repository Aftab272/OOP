public class commissionEmployee{
    protected String FirstName;
    protected String LastName;
    protected String SSN;
    protected double grossSales;
    protected double commonRate;

    public commissionEmployee(){
        FirstName="Aftab";
        LastName="Akram";
        SSN="S003";
        grossSales=1234.1;
        commonRate=12.5;
    }
    public commissionEmployee (String a,String b, double c,double d){
        FirstName=a;
        LastName=a;
        SSN=b;
        grossSales=c;
        commonRate=d;
    }

    public void setFN(String a){ FirstName=a;} 
public void setLN(String e){
     LastName=e;
    } 
public void setSSN(String b){
     SSN=b;
    } 
public void setGS(double c){ 
    grossSales=c;
} 
public void setCR(double d){ 
    commonRate=d;
} 
public String getFN(){
    return FirstName;
} 
public String getSSN(){
    return SSN;
} 
public double getGS(){
    
    return grossSales;
} 
public double getCR(){
    return commonRate;
} 
public double earnings(){
    return grossSales*commonRate;
}

public void display(){
 System.out.println("first name:" +FirstName+"last name:"+ LastName+"SSN:"+SSN+"Gross Sales:"+grossSales+" and commonRate:"+commonRate );
}
}
    
