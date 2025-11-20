public class patient {
    public String patientId;
    public hopistal hospital;
    public medicalrecord MedicalRecord;
    public String Summary;a

    patient(String patientId,hospital Hospital,medicalrecord MedicalRecord){
        this.patientId=patientId;
        this.medicalrecord=MedicalRecord;
        this.hospital=Hospital;
    }
    public void updateinfo(String pId){
        patientId=pId;
    }
    public void assignBed(String bedNo){

    }
    public void getSummary(String s){
       return Summary;
    }
    
}
