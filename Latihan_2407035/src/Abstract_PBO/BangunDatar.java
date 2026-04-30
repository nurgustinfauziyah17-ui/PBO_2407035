package Abstract_PBO;

public class BangunDatar {
    private String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    // abstract method
    abstract double hitungLuas();

    // abstract method untuk keliling
    abstract double hitungKeliling();

    public void display() {
        System.out.println("Ini adalah: " + nama);
    }
}
