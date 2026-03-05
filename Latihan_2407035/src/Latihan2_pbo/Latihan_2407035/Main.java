package Latihan2_pbo.Latihan_2407035;

public class Main {

    public static void main(String[] args) {
        Coba pp1 = new Coba();

        pp1.setPanjang(9);
        System.out.println("Panjangnya adalah : " + pp1.getPanjang());

        pp1.setLebar(13);
        pp1.cetakLuas();

        System.out.println("Luasnya adalah : " + pp1.hitungLuas());
    }
}