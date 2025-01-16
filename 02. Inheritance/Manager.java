public class Manager extends Employee{

    //field
    int age;

    // constructor
    Manager(String name, int age) {
        super(name);
        this.age = age;
    }
    
    // method
     void sayHello(String name) {
        System.out.println("hello " + name + " my name is " + this.name + " my age is " + this.age);
    }
    
}