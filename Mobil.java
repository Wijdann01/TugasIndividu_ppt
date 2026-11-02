public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String platNomor, String merk, int jumlahPintu) {
        super(platNomor, merk);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public double hitungTarif(int jarak) {
        // Tarif untuk mobil bisa berbeda dari kendaraan umum
        return 5000.0 * jarak; // Example calculation for cars
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    @Override
    public String getTipeKendaraan() {
        return "Mobil";
    }
}
