import java.util.*;

// Interface
interface Animal {
    void sound();
}

// Abstract Class
abstract class Shape {
    abstract double area();
}

// Parent Class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

// Child Class (Inheritance)
class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    // Method Overriding
    @Override
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Implementing Interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Extending Abstract Class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Cover_java {

    // Method
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Variables and Data Types
        int age = 20;
        double cgpa = 8.5;
        char grade = 'A';
        boolean passed = true;
        String name = "Shree";

        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);
        System.out.println("Name: " + name);

        // Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Multiplication: " + (a * b));

        // If-Else
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // Switch
        int day = 3;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // For Loop
        System.out.println("\nFor Loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // While Loop
        System.out.println("\n\nWhile Loop:");
        int count = 1;
        while(count <= 3) {
            System.out.println("Count = " + count);
            count++;
        }

        // Array
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("\nArray Elements:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        // Method Call
        System.out.println("\n\nSum = " + add(5, 7));

        // Object Creation
        Student s1 = new Student("Shree", 101);
        s1.display();

        // Interface
        Dog d = new Dog();
        d.sound();

        // Abstract Class
        Circle c = new Circle(5);
        System.out.println("Area of Circle = " + c.area());

        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("\nFruits:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // String Operations
        String text = "Java Programming";
        System.out.println("\nLength = " + text.length());
        System.out.println("Uppercase = " + text.toUpperCase());

        // Exception Handling
        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}