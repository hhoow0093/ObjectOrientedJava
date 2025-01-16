class Person {
    String name;
    String adress;
    final String country = "Indonesia";

    // buat constuctor namanya harus sama dengan nama class
    Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    // 2nd constructor
    Person(String name) {

        //memanggil constructor atas
        this(name, null);
    }

    //3rd constuctor
    Person() {
        // panggil constructor atas
        this(null);
    }

    void friend(String person1, String person2) {
        System.out.println(person1 + " " + "and" + " " + person2 + " are besties");
    }
}