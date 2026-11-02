public class Kendaraan {
    protected String platNomor;
    protected String merk;

    public Kendaraan(String platNomor, String merk) {
        this.platNomor = platNomor;
        this.merk = merk;
    }


    public double hitungTarif(int jarak) {
        // Default implementation, can be overridden in subclasses
        return 1000.0 * jarak; // Example calculation
    }

    public void displayInfo() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Merk: " + merk);
    }

    public String getTipeKendaraan() {
        return this.getClass().getSimpleName();
    }

}