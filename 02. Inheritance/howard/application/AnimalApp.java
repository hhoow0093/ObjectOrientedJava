package howard.application;

import howard.data.Animal;
import howard.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        //polymorphism
        Animal animal1 = new Cat();
        animal1.name = "jojo";

        animal1.run();
    }

}

// getter dan setter (encapsulation)
// tujuannya untuk menjaga data agar lebih baik.
// getter -> mengambil data
// setter -> mengubah data
