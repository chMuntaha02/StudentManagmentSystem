package course;
public class Course {
    private String courseCode;
    private String courseName;
    private double fee;
    public Course(String c,String n,double f){courseCode=c;courseName=n;fee=f;}
    public String getCourseCode(){return courseCode;}
    public String getCourseName(){return courseName;}
    public double getFee(){return fee;}
}
