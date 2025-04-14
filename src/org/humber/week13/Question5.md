# User Notification System

## Task 1:

Create a class `EmailNotification` by implementing the `NotificationService` interface. The `EmailNotification` class
should
have the attributes below and be constant throughout its objects' lifespan.

`email` - `String`
`subject` - `String`

### NotificationService Interface:

```java
public interface NotificationService {
    void sendNotification();

    void cancelNotification();
}
```

## Task 2:

When implementing the `NotificationService` interface in the `EmailNotification` class, `sendNotification()` should
print the `email` and `subject` values.

For example, `sendNotification()` should print:

#### "Sending email to john@gmail.com with subject 'Meeting Reminder'"

## Task 3:

Create a class `SMSNotification` by implementing the `AlertService` interface. The `SMSNotification` class should have
the below attributes and should be final.

* `phoneNumber` - `String`
* `message` - `String`

### AlertService Interface:

```java
public interface AlertService {
    void triggerAlert();

    void dismissAlert();
}
```

## Task 4:

When implementing the `triggerAlert` method, print the `phoneNumber` and `message` values. Implement `dismissAlert` to
indicate the alert has been dismissed.

## Task 5:

Execute the below main class to test the implementation.

```java
public class Main {
    public static void main(String[] args) {
        NotificationService emailNotification = new EmailNotification("john.doe@example.com", "Welcome");
        AlertService smsNotification = new SMSNotification("1234567890", "Your account has been created");

        emailNotification.sendNotification();
        smsNotification.triggerAlert();
        smsNotification.dismissAlert();
    }
}
```
