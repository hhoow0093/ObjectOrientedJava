package howard.data;

public class Bus implements Car {

    public void carDetail() {
        System.out.println("bus");
    }

    public void carTire() {
        System.out.println("8");
    }

    public String getBrand() {
        return "busway";

    }
    
    // tidak wajib tapi akan false jika tidak tulis
    public boolean isBig() {
        return true;
    }
}
