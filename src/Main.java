// Example of a simple class with a constructor
class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

// Example of encapsulation with a constructor
class BankAccount {
    private double balance; // Encapsulated attribute

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Encapsulated method to access the balance
    public double getBalance() {
        return balance;
    }

    // Encapsulated method to modify the balance
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// Example of inheritance
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound.");
    }
}

class Cat extends Animal {
    // Constructor
    public Cat() {
        System.out.println("A new cat is created.");
    }

    // Additional method specific to Cat
    void meow() {
        System.out.println("Meow!");
    }

    // Overridden method
    @Override
    void makeSound() {
        System.out.println("Cat purring.");
    }
}

// Example of polymorphism (method overloading)
class Calculator {
    // Method overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Example of polymorphism (method overriding)
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    // Overridden method
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Example of abstraction using an abstract class
abstract class Vehicle {
    // Abstract method
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

class Car extends Vehicle {
    // Implementation of the abstract method
    @Override
    void start() {
        System.out.println("Car is starting.");
    }
}

// Example of interface
interface ShapeInterface {
    // Methods in an interface are implicitly public and abstract
    void draw();

    double calculateArea();
}

class Rectangle implements ShapeInterface {
    // Implementation of interface methods
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public double calculateArea() {
        // Implementation for calculating the area of a rectangle
        return 0;
    }
}

// Example of enum
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Main class with the main method
public class Main {
    public static void main(String[] args) {
        // Example usage of each concept and constructor

        // Constructor and encapsulation example
        Person person = new Person("John", 25);
        person.introduce();

        BankAccount account = new BankAccount(1000);
        System.out.println("Initial balance: $" + account.getBalance());

        // Inheritance and polymorphism example
        Cat cat = new Cat();
        cat.meow();
        cat.makeSound(); // Polymorphic behavior

        // Method overloading example
        Calculator calculator = new Calculator();
        System.out.println("Sum (int): " + calculator.add(5, 7));
        System.out.println("Sum (double): " + calculator.add(3.5, 2.5));

        // Method overriding example
        Circle circle = new Circle();
        circle.draw(); // Polymorphic behavior

        // Abstraction using an abstract class
        Car car = new Car();
        car.start();
        car.stop();

        // Interface example
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        System.out.println("Area: " + rectangle.calculateArea());

        // Enum example
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
    }
}
