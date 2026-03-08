package PraktikumPemlan;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double sekon;
    private int kecepatanMeterPerSekon;

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getPlat(String noPlat) {
        return noPlat;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getWarna(String warna) {
        return warna;
    }

    public void setManufaktur(String manufaktur){
        this.manufaktur = manufaktur;
    }

    public String getManufaktur(String manufaktur) {
        return manufaktur;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
        rubahKecepatan(kecepatan);
    }

    public int getKecepatan(int kecepatan) {
        return kecepatan;
    }

    public double getWaktu(double waktu) {
        return waktu;
    }
 
    public void setWaktu(double waktu) {
        this.waktu = waktu;
        rubahSekon(waktu);
    }
    
    private void rubahSekon(double waktu) {
        this.sekon = waktu * 3600;
    }

    private void rubahKecepatan(int kecepatan) {
        int sekon = 3600;
        int meter = 1000;
        this.kecepatanMeterPerSekon = kecepatan * meter / sekon;
    }

    
    public double hitungJarak(int kecepatan, double waktu) {
        double jarak = kecepatan * waktu;
        return jarak;
    }

    public void displayMessage(){
    System.out.println("");
    System.out.println("==========================");
    System.out.println("Mobil anda bermerek " + manufaktur);
    System.out.println("mempunyai nomor plat " + noPlat);
    System.out.println("serta memililki warna " + warna);
    System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/jam");
    System.out.println("Mobil anda bisa menempuh perjalanan sejauh " + hitungJarak(kecepatan, waktu) + "km");
    System.out.println("==========================");
    }
}




