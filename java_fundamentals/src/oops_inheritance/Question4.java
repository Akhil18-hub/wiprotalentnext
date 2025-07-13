package oops_inheritance;

class Fruit {
    String name;
    String taste;
    int size;

    public Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

// Apple class
class Apple extends Fruit {
    public Apple(String name, String taste, int size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Apple: " + name + ", Taste: " + taste);
    }
}

// Orange class
class Orange extends Fruit {
    public Orange(String name, String taste, int size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Orange: " + name + ", Taste: " + taste);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Apple a = new Apple("Apple", "Sweet", 5);
        Orange o = new Orange("Orange", "Citrusy", 4);

        a.eat();
        o.eat();
    }
}
