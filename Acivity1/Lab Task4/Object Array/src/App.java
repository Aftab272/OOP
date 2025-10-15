public class App {
    public static void main(String[] args) throws Exception {
    Student[] students = {
        new Student("Ayesha",85),
        new Student("Bilal",90),
        new Student("Hina",78),
        new Student("Omar",88)
    
    };
    int total= 0;
    for(Student s: students){
        total +=s.marks;
    }
    double average = (double)total/students.length;
    System.out.println("Average Marks ="+average);

}
}
