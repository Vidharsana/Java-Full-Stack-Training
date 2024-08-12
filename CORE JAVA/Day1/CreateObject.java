class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class CreateObject {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.display();
    }
}
