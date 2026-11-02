public class Deluxe extends Mobil {
    boolean memilikiAC;

    public Deluxe(String platNomor, String merk, int jumlahPintu, boolean memilikiAC) {
        super(platNomor, merk, jumlahPintu);
        this.memilikiAC = memilikiAC;
    }

    @Override
    public double hitungTarif(int jarak) {
        // Tarif untuk mobil deluxe bisa berbeda dari mobil biasa
        return 10000.0 * jarak; // Example calculation for deluxe cars
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Memiliki AC: " + (memilikiAC ? "Ya" : "Tidak"));
    }

    @Override
    public String getTipeKendaraan() {
        return "Deluxe";
    }
    
}
