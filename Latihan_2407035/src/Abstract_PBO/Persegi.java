package Abstract_PBO;

public class Persegi {
    private double sisi;

    public Persegi(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    double hitungKeliling() {
        return 4 * sisi;
    }
    
}
