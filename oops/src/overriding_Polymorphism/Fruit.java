package overriding_Polymorphism;
import java.util.*;
class Fruit {
    String name, taste;
    int size;

    Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Sweet", 5);
    }

    void eat() {
        System.out.println(name + " is " + taste + " and crunchy");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Tangy", 4);
    }

    void eat() {
        System.out.println(name + " is " + taste + " and juicy");
    }

    public static void main(String[] args) {
        Fruit f1 = new Apple();
        Fruit f2 = new Orange();
        f1.eat();
        f2.eat();
    }
}
