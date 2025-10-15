public class App {
    public static void main(String[] args) throws Exception {
       faculty f1 = new faculty("aftab","Mphil");
       course [] c= new course[2];
       c[0]= new course("OOP",f1);
       c[1]= new course("DS",f1);
        f1.set_course_list(c);
        f1.view_teacher();

        student [] s=new student [3];
        s[0]= new student("Ali","fa24-bse-000",c);
        s[1]= new student("Sami","fa24-bse-001",c);
        s[2]= new student("Fiaz","fa24-bse-002",c);

        s[0].display_student_info();

        c[0].set_student_list(s);
        c[0].show_class_students();
    }
}
