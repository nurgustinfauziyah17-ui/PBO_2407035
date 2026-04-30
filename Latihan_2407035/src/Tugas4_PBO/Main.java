package Tugas4_PBO;

public class Main {
    
    public static void main(String[] args) {

        // membuat pesanan
        MenuItem item1 = new MenuItem("Es Jeruk", 5000, 1);
        MenuItem item2 = new MenuItem("Mie Ayam", 12000, 1);

        // tampilkan
        item1.tampilkan();
        System.out.println();

        item2.tampilkan();
        System.out.println();

        // total semua pesanan
        double totalPesanan = item1.hitungTotal() + item2.hitungTotal();

        System.out.println("Total Semua Pesanan: " + totalPesanan);
    }
}
