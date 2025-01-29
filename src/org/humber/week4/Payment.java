package org.humber.week4;


enum PaymentType {
    CASH, CREDIT_CARD, DEBIT_CARD, BANK_TRANSFER
}


public class Payment {

    private final double amount;
    private final PaymentType paymentType;

    public Payment(double amount, PaymentType paymentType) {
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void displayPaymentDetails() {
        System.out.println("Amount: " + amount);
        System.out.println("Payment Type: " + paymentType);
    }

}
