package howard.data;

public class ProductApp {
    public static void main(String[] args) {
        //bisa karena public berlaku semuanya
        Product produk1 = new Product("macbook pro", 3000000);

        //bisa akses karena protected berlau pada class, package, dan subclass
        System.out.println(produk1.name);
        System.out.println(produk1.price);

        System.out.println(produk1);

        Product produk2 = new Product("macbook pro", 3000000);

        System.out.println(produk1.equals(produk2));
        System.out.println(produk1.hashCode() == produk2.hashCode());

        
    }

}
