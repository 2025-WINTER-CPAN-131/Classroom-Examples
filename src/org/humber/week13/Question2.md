# Messaging System

## Task 1:

Create a class `Email` by implementing the `Message` interface. The `Email` class should have the attributes below and
be constant throughout its objects' lifespan.

* `recipient` - `String`
* `subject` - `String`

### Message Interface:

```java
public interface Message {
    void send();

    void receive();
}
```

## Task 2:

When implementing the `Message` interface in the `Email` class, `send()` should print the `recipient` and `subject`
values.

For example, `send()` should print:

#### "Sending email to recipient@example.com with subject 'Meeting Reminder'"

## Task 3:

Create a class `SMS` by implementing the `Notification` interface. The `SMS` class should have the below attributes and
should be final.

* `phoneNumber` - `String`
* `message` - `String`

### Notification Interface:

```java
public interface Notification {
    void notifyUser();

    void clearNotification();
}
```

## Task 4:

When implementing the `notifyUser` method, print the `phoneNumber` and `message` values. Implement `clearNotification`
to clear the message.

## Task 5:

Execute the below main class to test the implementation.

```java
public class Main {
    public static void main(String[] args) {
        Message email = new Email("recipient@example.com", "Meeting Reminder");
        Notification sms = new SMS("1234567890", "Your appointment is scheduled");

        email.send();
        sms.notifyUser();

        sms.clearNotification();
    }
}
```

