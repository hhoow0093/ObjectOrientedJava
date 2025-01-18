package howard.application;

// import howard.data.Product;
// untuk impor, access modifier harus public.
// untuk acess class yang lain dari package lain, harus menggunakan keyword impor
// dengan *, bisa impor semua class dalam package

import howard.data.*;

public class Apllication {
    public static void main(String[] args) {
        Product produk2 = new Product("laptop", 100000);
        System.out.println(produk2.name);
        System.out.println(produk2.price);
    }

}

// abstract class merupakan class tidak dapat dibuat sebagai objek secara langsung, 
// tapi bisa diturunkan.
