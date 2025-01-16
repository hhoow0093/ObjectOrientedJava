public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("budi");
        employee.sayHello("eko");

        employee = new Manager("budi", 12);
        employee.sayHello("eko");

        employee = new VicePresident("budi", 12, "mitra-raya");
        employee.sayHello("eko");

        sayHello(new Employee("budi"));
        sayHello(new Manager("budi", 12));
        sayHello(new VicePresident("budi", 12, "mitra-raya"));
    }

    //salah satu kegunaan polymorphism biar tida harus buat method banyak kali
    static void sayHello(Employee employee) {
        //typecheck & casts untuk meningkatkan keamanan dalam pengecekan polymorpshism
        if (employee instanceof VicePresident) {
            VicePresident vp = (VicePresident) employee;
            System.out.println("hello vice president " + vp.name);
        } 
         else if (employee instanceof Manager) {
            //konversi objek
            Manager manager = (Manager) employee;
            System.out.println("Hello manager " + manager.name);

        } else {
            System.out.println("hello employee " + employee.name);
        }
    }    
}
