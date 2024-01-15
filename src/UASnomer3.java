import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UASnomer3 {
    public static void main(String[] args) {
        ArrayList<String> lantai1 = new ArrayList<>();
        ArrayList<String> lantai2 = new ArrayList<>();
        ArrayList<String> lantai3 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukkan kapasitas mesin (CC) :");

        while (true) {
            try {
                String input = reader.readLine();

                if (input.equalsIgnoreCase("selesai")) {
                    break;
                }

                int kapasitasMesin = Integer.parseInt(input);
                String kendaraan = "Kendaraan " + kapasitasMesin + "CC";

                if (kapasitasMesin >= 2500) {
                    lantai1.add(kendaraan);
                    System.out.println("Ditempatkan di Lantai 1");
                } else if (kapasitasMesin >= 1500 && kapasitasMesin <= 2000) {
                    lantai2.add(kendaraan);
                    System.out.println("Ditempatkan di Lantai 2");
                } else if (kapasitasMesin >= 1000 && kapasitasMesin <= 1200) {
                    lantai3.add(kendaraan);
                    System.out.println("Ditempatkan di Lantai 3");
                }

            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }

        // Menampilkan data kendaraan di setiap lantai
        System.out.println("\nData Kendaraan di Lantai 1:");
        for (String kendaraan : lantai1) {
            System.out.println(kendaraan);
        }

        System.out.println("\nData Kendaraan di Lantai 2:");
        for (String kendaraan : lantai2) {
            System.out.println(kendaraan);
        }

        System.out.println("\nData Kendaraan di Lantai 3:");
        for (String kendaraan : lantai3) {
            System.out.println(kendaraan);
        }
    }
}
