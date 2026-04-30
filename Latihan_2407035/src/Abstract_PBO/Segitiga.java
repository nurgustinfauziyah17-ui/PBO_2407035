package Abstract_PBO;

public class Segitiga {
    private double alas, tinggi, sisiMiring;

    public Segitiga(String nama, double alas, double tinggi, double sisiMiring) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }
    
}
