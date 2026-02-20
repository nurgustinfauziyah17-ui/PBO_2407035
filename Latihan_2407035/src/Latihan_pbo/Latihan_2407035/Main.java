package Latihan_pbo.Latihan_2407035;

class Cafe{
    String nama;
    String alamat;
    String menu;

    //contrukstor
    Cafe(String nama, String alamat, String menu) {
        this.nama = nama;
        this.alamat = alamat;
        this.menu = menu;
        System.out.println("Nama Cafe  : " + nama);
        System.out.println("Alamat     : " + alamat);
        System.out.println("Menu       : " + menu);
        System.out.println();
    }

    //method
    
    void buka(){
        System.out.println("Cafe sudah buka");
    }
}

public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("jerami", "Karangampel", "Mie Goreng");
        cafe1.buka();
        Cafe cafe2 = new Cafe("kozi", "Indramayu Jabar", "Roti Bakar");
        cafe2.buka();
    }
}