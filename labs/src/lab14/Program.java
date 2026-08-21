package lab14;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
    	String test = "Invalid";
        List<PaymentMethod> payments = new ArrayList<>();
        //valid payment options
        if (test == "Valid") {
        payments.add(new CreditCardPayment("1234567890123456"));
        payments.add(new PayPalPayment("valid_email@email.com"));
        payments.add(new CryptoPayment("0xABC123456", 2500));
        }else if(test == "Invalid") {
        //invalid payment options
        payments.add(new CreditCardPayment("123456"));
        payments.add(new PayPalPayment("invalid_email"));
        }

        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayments(payments, 600);
    }
}