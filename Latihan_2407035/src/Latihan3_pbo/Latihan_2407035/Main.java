package Latihan3_pbo.Latihan_2407035;

public class Main {
    public static void main(String[] args) {
        Segitiga sTiga = new Segitiga();

        sTiga.setAlas(2);
        sTiga.setTinggi(3);
        System.out.println("Luas Segitiga adalah :" + sTiga.LuasSegitiga());

        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("Luas Persegi Adalah : " + persegi.LuasPersegi());

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(2);
        persegiPanjang.setLebar(3);
        persegiPanjang.setTinggi(6);
        System.out.println("Luas Persegi Panjang Adalah: " + persegiPanjang.LuasPersegiPanjang());

    }

}