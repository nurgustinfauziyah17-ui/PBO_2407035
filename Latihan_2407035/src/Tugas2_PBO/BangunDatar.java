package Tugas2_PBO;

public class BangunDatar {

    private double panjang;
    private double lebar;

    // con
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // setter
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}