# Home Automation System

## Task 1:

Create a class **`SmartLight`** by implementing the **`Device`** interface. The **`SmartLight`** class should have the
following attributes, which are constant for each object:

* id - String
* location - String

### Device Interface:

```java
public interface Device {
    void turnOn();

    void turnOff();

    void status();
}
```

## Task 2:

When implementing the **`turnOn()`** method, print the **`id`** and **`location`** values.

For example:

#### "Turning on smart light in the Living Room with ID LIGHT001"

## Task 3:

Create a class **`SmartThermostat`** by implementing the **`TemperatureControl`** interface. The **`SmartThermostat`**
class should have the following attributes:

* temperature - int
* mode - String

### TemperatureControl Interface:

```java
public interface TemperatureControl {
    void increaseTemperature();

    void decreaseTemperature();
}
```

## Task 4:

Implement **`increaseTemperature()`** to increase the temperature and print the new value. Implement *
*`decreaseTemperature()`** to decrease the temperature and print the new value.

## Task 5:

Execute the below main class to test the implementation.

```java
public class Main {
    public static void main(String[] args) {
        Device light = new SmartLight("LIGHT001", "Living Room");
        TemperatureControl thermostat = new SmartThermostat(22, "Cool");

        light.turnOn();
        thermostat.increaseTemperature();
        thermostat.decreaseTemperature();
        light.turnOff();
    }
}
```
