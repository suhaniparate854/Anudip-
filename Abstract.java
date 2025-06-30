abstract class Animal{
    abstract void walk();
    void eat(){
        System.out.println("animal can eat");
    }
}
class Dog extends Animal{
    public void walk(){
        System.out.println("my extended");
    }
}
public class Abstract{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.walk();
        d.eat();
    }
}