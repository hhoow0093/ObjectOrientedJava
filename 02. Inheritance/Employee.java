public class Employee {
    String name;

    Employee(String name) {
        this.name = name;

    }
    void sayHello(String name) {
        System.out.println("hello " + name + " my name is " + this.name);
    }
    
}
