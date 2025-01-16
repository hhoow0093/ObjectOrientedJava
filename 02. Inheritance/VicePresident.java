public class VicePresident extends Manager {
    String company;

    VicePresident(String name, int age, String company) {
        // ambil field dari parent (super constructor)
        super(name, age);
        this.company = company;
    }


    // overriding method parent 
    void sayHello(String name) {
        System.out.println("hello " + name + " my name is " + this.name + " my age is " + this.age + " im from " + this.company);
    }
}
