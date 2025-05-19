package JavaTraining.Task4;

// Abstract Payment System

public class PaymentSystem {
  public static void main(String[] args) {
    Payment card = new CreditCardPayment(100, "Rupees");
    Payment paypal = new PaypalPayment(50, "Dollars");

    card.displayPaymentInfo();
    card.processPayment();

    System.out.println();

    paypal.displayPaymentInfo();
    paypal.processPayment();
  }
  
}
