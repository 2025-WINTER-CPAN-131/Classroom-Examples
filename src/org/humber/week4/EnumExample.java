package org.humber.week4;

public class EnumExample {


    public static void main(String[] args) {
        Payment bankPayment = new Payment(10, PaymentType.BANK_TRANSFER);

        Payment cashPayment = new Payment(20, PaymentType.CASH);

        Payment creditCardPayment = new Payment(30, PaymentType.CREDIT_CARD);

        Payment debitCardPayment = new Payment(40, PaymentType.DEBIT_CARD);

        bankPayment.displayPaymentDetails();
        cashPayment.displayPaymentDetails();
        creditCardPayment.displayPaymentDetails();
        debitCardPayment.displayPaymentDetails();
    }

}
