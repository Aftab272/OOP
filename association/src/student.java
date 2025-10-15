public class student {
    private String name;
    private String reg_no;
    course [] course_list;

    student (String name, String reg_no, course [] course_list){
        this.name =name;
        this.reg_no=reg_no;
        this.course_list=course_list;


    }
    public void display_student_info(){
        System.out.println("The name is"+name);
        System.out.println("The reg no is"+reg_no);
        for(int i=0;i<2;i++){
            System.out.println("The course name is="+course_list[i].getcourse_name());
        }

    }
    public String get_student_name(){
        return name;
    }
}
