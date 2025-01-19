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

    // override toString() method
    public String toString() {
        return "Product name: " + name + " product price " + price;
    }

    // override equals method
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }

        Product product = (Product) o;
        if (this.price != product.price) {
            return false;
        }

        if (this.name != null) {
            return this.name.equals(product.name);
        } else {
            return product.name == null;
        }

    }

    public int hashCode() {
        int result = this.name != null ? name.hashCode() : 0;
        result = 31 * result + this.price;
        return result;
    }
}

// access modifier
// 1. public = class, subclass, package, world
// 2. protected = class, subclass, package
// 3. private = class
// 4. no modifier = class, package