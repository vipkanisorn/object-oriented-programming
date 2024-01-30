// Example of a simple class
class Car {
    // Attributes
    String make;
    String model;
    int year;

    // Methods
    void start() {
        System.out.println("The car is starting.");
    }

    void drive() {
        System.out.println("The car is moving.");
    }
}

// Example of encapsulation
class BankAccount {
    private double balance; // Encapsulated attribute

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
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Example of polymorphism (method overloading)
class Calculator {
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
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Example of abstraction using an abstract class
abstract class AbstractShape {
    abstract void draw();
}

class ConcreteCircle extends AbstractShape {
    @Override
    void draw() {
        System.out.println("Drawing a concrete circle.");
    }
}

// Example of interface
interface ShapeInterface {
    void draw();
    double calculateArea();
}

class CircleWithInterface implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public double calculateArea() {
        // Implementation for calculating the area of a circle
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
        // Create objects and demonstrate functionality here
        Car myCar = new Car();
        myCar.start();
        myCar.drive();

        BankAccount myAccount = new BankAccount();
        myAccount.deposit(1000);
        System.out.println("Current balance: $" + myAccount.getBalance());

        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        Calculator myCalculator = new Calculator();
        System.out.println("Sum (int): " + myCalculator.add(5, 7));
        System.out.println("Sum (double): " + myCalculator.add(3.5, 2.5));

        Circle myCircle = new Circle();
        myCircle.draw();

        ConcreteCircle concreteCircle = new ConcreteCircle();
        concreteCircle.draw();

        CircleWithInterface circleWithInterface = new CircleWithInterface();
        circleWithInterface.draw();
        System.out.println("Area: " + circleWithInterface.calculateArea());

        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
    }
}
