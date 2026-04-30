package Tugas4_PBO;

public class MenuItem extends Menu {
    
    private int jumlah;

    // constructor
    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // method hitung total (override)
    @Override
    public double hitungTotal() {
        return getHarga() * jumlah;
    }

    // tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Menu: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: " + hitungTotal());
    }
}

