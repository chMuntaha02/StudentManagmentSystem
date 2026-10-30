package payment;
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via Credit Card");
    }
}
