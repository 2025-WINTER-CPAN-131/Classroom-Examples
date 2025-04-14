# Payment Gateway System

## Task 1:

Create a class `CreditCard` by implementing the `PaymentMethod` interface. The `CreditCard` class should have the
attributes below and be constant throughout its objects' lifespan.

* `cardNumber` - `String`
* `cardHolder` - `String`

### PaymentMethod Interface:

```java
public interface PaymentMethod {
    void processPayment(double amount);

    void refund(double amount);
}
```

## Task 2:

When implementing the `PaymentMethod` interface in the `CreditCard` class, `processPayment()` should print
the `cardNumber` and `cardHolder` values.

For example, `processPayment()` should print:

##### "Processing payment of $100 using card 1234-5678-9012-3456 held by John Doe"

## Task 3:

Create a class `PayPal` by implementing the `Transaction` interface. The `PayPal` class should have the below attributes
and should be final.

* `email` - `String`
* `transactionId` - `String`

### Transaction Interface:

```java
public interface Transaction {
    void execute();

    void cancel();
}
```

## Task 4:

When implementing the `execute` method, print the `email` and `transactionId` values. Implement `cancel` to indicate the
transaction is canceled.

## Task 5:

Execute the below main class to test the implementation.

```java
public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard("1234-5678-9012-3456", "John Doe");
        Transaction payPal = new PayPal("john.doe@example.com", "TX12345");

        creditCard.processPayment(100);
        payPal.execute();
        payPal.cancel();
    }
}
```

