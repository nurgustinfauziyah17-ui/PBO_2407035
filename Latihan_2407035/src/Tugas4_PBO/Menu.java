package Tugas4_PBO;

public class Menu {
    
    private String nama;
    private double harga;

    // constructor
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // method hitung total (default)
    public double hitungTotal() {
        return harga;
    }

    // tampilkan
    public void tampilkan() {
        System.out.println("Menu: " + nama);
        System.out.println("Harga: " + harga);
    }

}
