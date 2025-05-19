package JavaTraining.Task4;

// Abstract Payment System

abstract class Payment {
  int amount;
  String currency;

  public Payment(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public void displayPaymentInfo() {
    System.out.printf("Amount: %d, Currency: %s%n", amount, currency);
  }

  public abstract void processPayment();
}

class CreditCardPayment extends Payment {
  public CreditCardPayment(int amount, String currency) {
    super(amount, currency);
  }
  @Override
  public void processPayment() {
    System.out.println("Paid using credit card");
  }
}

class PaypalPayment extends Payment {
  public PaypalPayment(int amount, String currency) {
    super(amount, currency);
  }
  @Override
  public void processPayment() {
    System.out.println("Paid using PayPal");
  }
}