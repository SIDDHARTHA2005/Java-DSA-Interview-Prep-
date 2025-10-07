package oopskunal.encapsulation;

    // File: ObjectDemo.java
class Car implements Cloneable {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // 1. toString() → String representation of object
    @Override
    public String toString() {
        return "Car{brand='" + brand + "', year=" + year + "}";
    }

    // 2. equals(Object obj) → Compare contents instead of memory reference
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (!(obj instanceof Car)) return false; // not a Car
        Car other = (Car) obj;
        return this.brand.equals(other.brand) && this.year == other.year;
    }

    // 3. hashCode() → should be consistent with equals()
    @Override
    public int hashCode() {
        return brand.hashCode() + year; // simple hash
    }

    // 4. clone() → duplicate object
    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}

public class testObjectClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car("Tesla", 2025);
        Car c2 = new Car("Tesla", 2025);
        Car c3 = c1; // same reference
        Car c4 = c1.clone(); // cloned object

        // 1. toString()
        System.out.println("toString() Example:");
        System.out.println("c1 = " + c1); // Calls overridden toString()

        // 2. equals()
        System.out.println("\nequals() Example:");
        System.out.println("c1.equals(c2)? " + c1.equals(c2)); // true (same content)
        System.out.println("c1.equals(c3)? " + c1.equals(c3)); // true (same object)
        System.out.println("c1 == c2? " + (c1 == c2)); // false (different objects)
        System.out.println("c1 == c3? " + (c1 == c3)); // true (same reference)

        // 3. hashCode()
        System.out.println("\nhashCode() Example:");
        System.out.println("c1.hashCode(): " + c1.hashCode());
        System.out.println("c2.hashCode(): " + c2.hashCode()); // same as c1 (same content)

        // 4. getClass()
        System.out.println("\ngetClass() Example:");
        System.out.println("c1.getClass(): " + c1.getClass().getName());

        // 5. clone()
        System.out.println("\nclone() Example:");
        System.out.println("c4 (cloned) = " + c4);
        System.out.println("c1 == c4? " + (c1 == c4)); // false (different objects)
        System.out.println("c1.equals(c4)? " + c1.equals(c4)); // true (same content)
    }
}

