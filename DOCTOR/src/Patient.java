import java.util.*;
public class Patient{
    private String name;
    private List<Doctor>doctors=new ArrayList<>();

    public Patient(String name){
        this.name = name;
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public String getName(){
        return name;
    }
    public List<Doctor> getDoctors(){
        return doctors;
    }
}