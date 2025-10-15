publis class Doctor{
    private String name;
    private List<Patient>patients=new ArrayList<>();
    
    public Doctor(String name){
        this.name=name;
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }
    public String getName(){
        return name;
    }
    public List<Patient> getPatients(){
        return patients;
    }
}