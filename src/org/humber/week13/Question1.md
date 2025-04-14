# E-commerce System

## Task 1:

Create a class **`Product`** by implementing the `Item` interface. The `Product` class should have the attributes below
and be constant throughout its objects' lifespan.

* `id` - `String`
* `name` - `String`

### Item Interface:

```java
public interface Item {
    String getId();

    String getName();
}
```

## Task 2:

When implementing the **`Item`** interface in the `Product` class, `displayDetails()` should print the id and name
values of the product.

For example, `displayDetails()` should print:

#### "Product Name: XYZ, ID: 1234"

## Task 3:

Create a class `ShoppingCart` by implementing the `Cart` interface. The `ShoppingCart` class should have the below
attributes and should be `final`.

* `items` - `List<Items>`

### Cart Interface:

```java
public interface Cart {
    void addItem(Item item);

    void removeItem(Item item);

    double calculateTotal();
}
```

## Task 4:

When implementing the `addItem` method, print the item’s details and then add the item to the cart.
Implement `calculateTotal` to sum up the prices of all items in the cart.

## Task 5:

Execute the below main class to test the implementation.

```java
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1234", "Laptop");
        Product product2 = new Product("5678", "T-Shirt");

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1);
        cart.addItem(product2);

        System.out.println("Total: " + cart.calculateTotal());
    }
}
```

## Bonus Task:
Introduce `Category` enum in the `Product` class and update the `displayDetails()` method to print the category of the product.

For example, `displayDetails()` should print:
#### "Product Name: XYZ, ID: 1234, Category: ELECTRONICS"

Category enum:
```java
public enum Category {
    ELECTRONICS,
    CLOTHING,
    GROCERY
}
```

updated main class:
```java
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1234", "Laptop", Category.ELECTRONICS);
        Product product2 = new Product("5678", "T-Shirt", Category.CLOTHING);
        Product product3 = new Product("9101", "Rice", Category.GROCERY);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);
        
        System.out.println("Total: " + cart.calculateTotal());
    }
}
```
