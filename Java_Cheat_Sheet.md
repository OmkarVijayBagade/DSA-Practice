# Java Cheat Sheet

## 1. Hello World
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 2. Variables & Data Types
```java
int age = 21;
double pi = 3.14;
char grade = 'A';
boolean isOn = true;
String name = "Omkar";
```

## 3. Constants
```java
final int SPEED = 100;
```

## 4. If-Else
```java
int score = 85;
if (score > 90) {
    System.out.println("A");
} else {
    System.out.println("B");
}
```

## 5. Switch
```java
int day = 2;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

## 6. Loops
```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}

int n = 3;
while (n > 0) {
    System.out.println(n);
    n--;
}
```

## 7. Arrays
```java
int[] nums = {1, 2, 3};
System.out.println(nums[0]);
```

## 8. ArrayList
```java
import java.util.ArrayList;
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
System.out.println(list.get(0));
```

## 9. HashMap
```java
import java.util.HashMap;
HashMap<String, String> map = new HashMap<>();
map.put("name", "Omkar");
System.out.println(map.get("name"));
```

## 10. Functions (Methods)
```java
public static int add(int a, int b) {
    return a + b;
}
System.out.println(add(2, 3));
```

## 11. Classes & Objects
```java
class Car {
    String brand = "Ford";
    void drive() { System.out.println("Driving"); }
}
Car myCar = new Car();
myCar.drive();
```

## 12. Constructors
```java
class Person {
    String name;
    Person(String n) { name = n; }
}
Person p = new Person("Omkar");
System.out.println(p.name);
```

## 13. Inheritance
```java
class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}
Dog d = new Dog();
d.sound();
```

## 14. Interfaces
```java
interface Animal { void sound(); }
class Cat implements Animal {
    public void sound() { System.out.println("Meow"); }
}
Cat c = new Cat();
c.sound();
```

## 15. Exception Handling
```java
try {
    int a = 5 / 0;
} catch (Exception e) {
    System.out.println("Error: " + e);
}
```

## 16. Final Keyword
```java
final int x = 10; // cannot be changed
```

## 17. Static Keyword
```java
class Demo {
    static void show() { System.out.println("Static method"); }
}
Demo.show();
```

## 18. Packages & Import
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

## 19. Wrapper Classes
```java
Integer a = 10;
Double b = 3.14;
```

## 20. Lambda Expression (Java 8+)
```java
import java.util.*;
List<Integer> numsList = Arrays.asList(1, 2, 3);
numsList.forEach(n -> System.out.println(n));
```
