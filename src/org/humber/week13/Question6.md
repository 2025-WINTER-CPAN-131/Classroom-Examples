# Warehouse Management System

## Task 1:

Create a class **`Forklift`** by implementing the **`Machinery`** interface. The **`Forklift`** class should have the
following attributes, which are constant for each object:

* `modelNumber` - `String`
* `capacity` - `int`

### Machinery Interface:

```java
public interface Machinery {
    void start();

    void stop();

    void lift();
}
```

## Task 2:

When implementing the **`start()`** method in the **`Forklift`** class, it should print the **`modelNumber`** and *
*`capacity`** values.

For example, start() should print:

#### "Starting forklift with model number FKL123 and capacity 2000 kg"

## Task 3:

Create a class **`ConveyorBelt`** by implementing the **`Operational`** interface. The **`ConveyorBelt`** class should
have the following attributes:

* **`length`** - **`double`**
* **`speed`** - **`double`**

### Operational Interface:

```java
public interface Operational {
    void activate();

    void deactivate();
}
```

## Task 4:

When implementing the **`activate()`** method, print the **`length`** and **`speed`** values. Implement **`deactivate()`
** to indicate that the **`conveyor`** belt is stopping.

## Task 5:

Execute the below main class to test the implementation.

```java
public class Main {
    public static void main(String[] args) {
        Machinery forklift = new Forklift("FKL123", 2000);
        Operational conveyorBelt = new ConveyorBelt(15.5, 2.3);

        forklift.start();
        conveyorBelt.activate();
        conveyorBelt.deactivate();
        forklift.stop();
    }
}
```
