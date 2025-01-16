public class ManagerApp {
    public static void main(String[] args) {
        Manager person1 = new Manager("howard", 12);
        // person1.name = "howard";
        // person1.age = 12;
        person1.sayHello("jasmine");

        VicePresident person2 = new VicePresident("eko", 12, "mitra-raya") ;
        // person2.name = "eko";
        // person2.age = 12;
        person2.sayHello("jasmine");
    }
}