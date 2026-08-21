package lab14;

import java.util.List;

public class PaymentProcessor {

    public void processPayments(List<PaymentMethod> payments, double amount) {

        for (PaymentMethod payment : payments) {

            System.out.println("\nPayment Details:");
            System.out.println(payment.getPaymentDetails());

            boolean successful = payment.processPayment(amount);

            if (successful) {
                System.out.println("Transaction successful.");
            } else {
                System.out.println("Transaction failed.");
            }
        }
    }
}