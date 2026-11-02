public class Motor extends Kendaraan {
    private boolean memilikiBox;

    public Motor(String platNomor, String merk, boolean memilikiBox) {
        super(platNomor, merk);
        this.memilikiBox = memilikiBox;
    }

    @Override
    public double hitungTarif(int jarak) {
        // Tarif untuk motor bisa berbeda dari kendaraan umum
        return 2000.0 * jarak; // Example calculation for motorcycles
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Memiliki Box: " + (memilikiBox ? "Ya" : "Tidak"));
    }

    @Override
    public String getTipeKendaraan() {
        return "Motor";
    }
    
}
