package howard.application;

public class EqualsApp {
    public static void main(String[] args) {
        
        String nama1 = "Howard dai";
        String nama2 = "Howard";
        nama2 = nama2 + " " + "dai";

        // false karena jenis object yang berbeda namun class yang sama.
        System.out.println(nama1 == nama2);

        // true karena bandingkan isis konten string
        System.out.println(nama1.equals(nama2));
    }

}
