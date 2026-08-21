package lab14;

public class PayPalPayment extends PaymentMethod {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {

        if (email.contains("@")) {
            System.out.println("PayPal payment of £" + amount +
                    " processed for " + email);
            return true;
        } else {
            System.out.println("PayPal payment failed - invalid email.");
            return false;
        }
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal: " + email;
    }
}