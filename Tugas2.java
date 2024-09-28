import java.util.Scanner;

class BangunDatar {

    public void hitungPersegi(double sisi) {
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi: " + keliling);
    }

    public void hitungPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }

    public void hitungLingkaran(double jarijari) {
        double luas = Math.PI * jarijari * jarijari;
        double keliling = 2 * Math.PI * jarijari;
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunDatar bangunDatar = new BangunDatar();

        System.out.println("Pilih bangun datar yang ingin dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan anda (1/2/3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                bangunDatar.hitungPersegi(sisi);
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                bangunDatar.hitungPersegiPanjang(panjang, lebar);
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                bangunDatar.hitungLingkaran(jariJari);
                break;
            default:
                System.out.println("Pilihan anda tidak valid :p");
        }
        input.close();
    }
}
