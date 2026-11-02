import java.util.ArrayList;

public class MainTransportasi {
    public static void main(String[] args) {
        Mobil Mobil1 = new Mobil("B 1234 CD", "Toyota", 4);
        Motor Motor1 = new Motor("B 5678 EF", "Honda", true);
        Deluxe Deluxe1 = new Deluxe("B 9101 GH", "BMW", 4, true);
        Deluxe Deluxe2 = new Deluxe("B 1122 IJ", "Mercedes", 4, false);

        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        daftarKendaraan.add(Mobil1);
        daftarKendaraan.add(Motor1);
        daftarKendaraan.add(Deluxe1);
        daftarKendaraan.add(Deluxe2);

        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.displayInfo();
            System.out.println("Tipe Kendaraan: " + kendaraan.getTipeKendaraan());
            System.out.println("Tarif untuk jarak 10 km: " + kendaraan.hitungTarif(10));
            System.out.println("---------------------------");
        }

        int totalTarif = 0;
        int jumlahMobil = 0;
        int jumlahMotor = 0;
        int jumlahDeluxe = 0;
        int jumlahKendaraan = daftarKendaraan.size();

        for (Kendaraan k : daftarKendaraan) {
            double tarif = k.hitungTarif(10);
            totalTarif += tarif;
            if (k instanceof Deluxe) {
                jumlahDeluxe++;
            } else if (k instanceof Motor) {
                jumlahMotor++;
            } else if (k instanceof Mobil) {
                jumlahMobil++;
            }
        }

        System.out.println("Total Tarif: " + totalTarif);
        System.out.println("Jumlah Mobil: " + jumlahMobil);
        System.out.println("Jumlah Motor: " + jumlahMotor);
        System.out.println("Jumlah Deluxe: " + jumlahDeluxe);
        System.out.println("Jumlah Kendaraan: " + jumlahKendaraan);

    }
}
