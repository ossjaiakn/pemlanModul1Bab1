package PraktikumPemlan;
// Ahmad Dzaikra Javier
// 255150301111025
// TI-A
import java.util.Scanner;

public class Main_Mobil {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    

    Mobil m1 = new Mobil();

    System.out.println("==========================");
    System.out.print("Manufaktur yang anda inginkan : ");
    String manufaktur = sc.nextLine();
    m1.setManufaktur(manufaktur);

    System.out.print("Pilih warna kesukaan anda : ");
    String warna = sc.nextLine();
    m1.setWarna(warna);
    
    System.out.print("Custom nomer plat : ");
    String noPlat = sc.nextLine();
    m1.setNoPlat(noPlat);

    System.out.print("Kecepatan mobil yang anda inginkan (km/jam) : ");
    int kecepatan = sc.nextInt();
    sc.nextLine();
    m1.setKecepatan(kecepatan);

    System.out.print("Masukkan disini, berapa jam waktu yang ingin anda tempuh dengan kecepatan diatas (untuk mengetahui jarak) : ");
    double waktu = sc.nextDouble();
    m1.setWaktu(waktu);
    m1.hitungJarak(kecepatan, waktu);
    System.out.println("==========================");

    m1.displayMessage();
    }
}

