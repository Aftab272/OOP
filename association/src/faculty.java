public class faculty {
    private String name;
    private String qualification;
    private course [] courselist;
    faculty(String name, String qualification)
    {
        this.name =name;
        this.qualification=qualification;

    }
    public void set_course_list(course [] courselist){
        this.courselist=courselist;
    }
    public void view_teacher(){
        System.out.println("the name of the teacher is:"+name);
        System.out.println("the name of the qualification:"+qualification);
        System.out.println("the list of course is:");
        for( course a:courselist){
            System.out.println(a.getcourse_name());
        }
    }
}
