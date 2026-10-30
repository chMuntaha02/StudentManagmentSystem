package main;
import student.Student;
import course.Course;
import payment.*;
import enrollment.EnrollmentService;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S01", "Muntaha", "muntaha@email.com");
        Course c1 = new Course("CS101", "Java Programming", 5000);
        
        PaymentMethod payment = new CreditCardPayment();
        
        EnrollmentService service = new EnrollmentService();
        service.enroll(s1, c1, payment);
    }
}
