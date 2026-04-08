package Tugas2_PBO;

public class BangunRuang extends BangunDatar {
    // atribut tambahan
    private double tinggi;

    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent
        this.tinggi = tinggi;
    }

    // method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}