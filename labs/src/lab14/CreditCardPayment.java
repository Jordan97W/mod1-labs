package lab14;

public class CreditCardPayment extends PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {

        if (cardNumber.length() == 16) {
            System.out.println("Credit card payment of £" + amount + " processed.");
            return true;
        } else {
            System.out.println("Credit card payment failed - invalid card number.");
            return false;
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card: **** **** **** " +
                cardNumber.substring(cardNumber.length() - 4);
    }
}