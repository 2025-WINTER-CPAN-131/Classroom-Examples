# Vehicle Management System

## Task 1:

Create a class `Truck` by implementing the `Vehicle` interface. The `Truck` class should have the attributes below and
be constant throughout its objects' lifespan.

* `registrationNumber` - `String`
* `type` - `String`

### Vehicle Interface:

```java
public interface Vehicle {
    void start();

    void stop();

    void honk();
}
```

## Task 2:

When implementing the `Vehicle` interface in the `Truck` class, `start()` should print the `registrationNumber`
and `type` values.

For example, `start()` should print:

#### "Starting truck of type Pickup with registration number ABC123"

## Task 3:

Create a class `Bus` by implementing the `Transport` interface. The `Bus` class should have the below attributes and
should be final.

* `route` - `String`
* `capacity` - `int`

### Transport Interface:

```java
public interface Transport {
    void board();

    void alight();
}
```

## Task 4:

When implementing the `board` method, print the `route` and `capacity` values. Implement `alight` to indicate passengers
are alighting.

## Task 5:

Execute the below main class to test the implementation.

```java
public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck("ABC123", "Pickup");
        Transport bus = new Bus("Route 45", 50);

        truck.start();
        bus.board();
        bus.alight();
        truck.stop();
    }
}
```
