package howard.data;

// mirip seprti absract class dan abstract method.
// 1. tidak bisa buat objek dari interface
// 2. method di dalam interface sudah pasti abstract method, jadi harus di override.

public interface Car extends HasBrand{
    void carDetail();

    void carTire();

    // default biar tiap kali ada method baru, turunan dari interface todak wajib override method tersebut.
    default boolean isBig() {
        return false;
    };

}
