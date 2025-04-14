# Library Management System

#### Task 1:

Create a class `Book` by implementing the `Readable` interface. The `Book` class should have the following attributes,
which are constant for each object:

- `title` - `String`
- `author` - `String`

**Readable Interface:**

```java
public interface Readable {
    void open();

    void close();

    void read();
}
```

#### Task 2:

When implementing the `open()` method in the `Book` class, it should print the `title` and `author` values.

For example, `open()` should print:  
`"Opening the book titled '1984' by George Orwell"`

---

#### Task 3:

Create a class `Magazine` by implementing the `Publishable` interface. The `Magazine` class should have the following
attributes:

- `issueNumber` - `int`
- `category` - `String`

**Publishable Interface:**

```java
public interface Publishable {
    void publish();

    void retract();
}
```

#### Task 4:

When implementing the `publish()` method, print the `issueNumber` and `category` values. Implement `retract()` to
indicate that the magazine is no longer available.

---

#### Task 5:

Execute the below main class to test the implementation.

```java
public class Main {
    public static void main(String[] args) {
        Readable book = new Book("1984", "George Orwell");
        Publishable magazine = new Magazine(101, "Science");

        book.open();
        book.read();
        book.close();

        magazine.publish();
        magazine.retract();
    }
}
```
