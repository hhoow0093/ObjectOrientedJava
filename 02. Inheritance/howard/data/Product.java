package howard.data;

public class Product {
    //field (akses hanya untuk package, class dan sub class)
    // protected String name;
    // protected int price;

    //field (bisa akses luar package)
    public String name;
    public int price;



    //constuctor
    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }
}

// access modifier
// 1. public = class, subclass, package, world
// 2. protected = class, subclass, package
// 3. private = class
// 4. no modifier = class, package