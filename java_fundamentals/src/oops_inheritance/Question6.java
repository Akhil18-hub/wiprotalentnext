package oops_inheritance;
class Animal {
    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}
class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Eating seeds");
    }

    void fly() {
        System.out.println("Flying");
    }
}
public class Question6 {
    public static void main(String[] args) {
        Animal a = new Animal(); 
        Bird b = new Bird();    

        a.eat();    
        a.sleep(); 

        b.eat();   
        b.sleep();  
        b.fly();  
    }
}
