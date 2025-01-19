package howard.data;

// untuk menggunakan interface, gunakan keyword "implements"

// multiple interface inheritance
public class Avanza implements Car, IsMaintenance {
    public void carDetail() {
        System.out.println("toyota avanza");

    }

    public void carTire() {
        System.out.println("car tire is 4");

    }

    public String getBrand() {
        return "toyota";
    }

    public boolean isMaintenance() {
        return false;
    }

}
