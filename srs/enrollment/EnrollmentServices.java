package enrollment;
import student.Student;
import course.Course;
import payment.PaymentMethod;

public class EnrollmentService {
    public void enroll(Student s, Course c, PaymentMethod p) {
        System.out.println("Enrolling: " + s.getName() + " in " + c.getCourseName());
        p.pay(c.getFee());
        System.out.println("Enrollment Successful!");
    }
}
