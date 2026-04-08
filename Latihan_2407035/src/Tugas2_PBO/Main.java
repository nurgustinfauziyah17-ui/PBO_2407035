package Tugas2_PBO;

public class Main {
    public static void main(String[] args) {
        // data
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        // objek
        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        // output
        System.out.println("Luas alas: " + br.hitungLuas());
        System.out.println("Volume: " + br.hitungVolume());
    }
}