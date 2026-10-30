package student;
public class Student {
    private String studentId; private String name; private String email;
    public Student(String id,String n,String e){studentId=id;name=n;email=e;}
    public String getStudentId(){return studentId;}
    public String getName(){return name;}
    public String getEmail(){return email;}
}
