 class UsiaPendekar {
    private int tahunLahir;

    public UsiaPendekar() {
        this.tahunLahir = 2000; // Nilai default
    }

    public UsiaPendekar(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int hitungUsia(int tahunSekarang) {
        return tahunSekarang - tahunLahir;
    }
}

public class Pendekar {
    private String nama;
    private int kekuatan;
    private int kesehatan;
    private UsiaPendekar usia;

    public Pendekar() {
        this.nama = "Tanpa Nama";
        this.kekuatan = 10; // Nilai default
        this.kesehatan = 100; // Nilai default
        this.usia = new UsiaPendekar(); // Usia default
    }

    public Pendekar(String nama, int kekuatan, int kesehatan, UsiaPendekar usia) {
        this.nama = nama;
        this.kekuatan = kekuatan;
        this.kesehatan = kesehatan;
        this.usia = usia;
    }

    // Getter dan setter untuk atribut
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public UsiaPendekar getUsia() {
        return usia;
    }

    public void setUsia(UsiaPendekar usia) {
        this.usia = usia;
    }

    public int hitungUsia() {
        int tahunSekarang = 2024; // Tahun saat ini
        return usia.hitungUsia(tahunSekarang); 
    }

    public void serang(Pendekar lawan) {
        System.out.println(nama + " menyerang " + lawan.nama + " dengan kekuatan " + kekuatan);
        lawan.kesehatan -= kekuatan;

        if (lawan.kesehatan <= 0) {
            System.out.println(lawan.nama + " kalah dalam pertarungan!");
            return; // Tidak menghentikan program
        }
    }

    public void periksaKesehatan() {
        System.out.println("Kesehatan " + nama + ": " + kesehatan);
        if (kesehatan > 0) {
            System.out.println("Pertarungan masih berlanjut");
        } else {
            System.out.println("Pendekar telah kalah");
        }
    }

    public void latihan() {
        kekuatan += 5;
        System.out.println(nama + " melakukan latihan dan meningkatkan kekuatan");
    }

    public void istirahat() {
        kesehatan += 10;
        System.out.println(nama + " beristirahat dan memulihkan kesehatan");
    }

    public void infoPendekar() {
        System.out.println("Nama: " + nama);
        System.out.println("Kekuatan: " + kekuatan);
        System.out.println("Kesehatan: " + kesehatan);
        System.out.println("Usia: " + hitungUsia());
    }

    public static void main(String[] args) {
        UsiaPendekar usiapendekar1 = new UsiaPendekar(1999);
        UsiaPendekar usiapendekar2 = new UsiaPendekar(2004);

        Pendekar pendekar1 = new Pendekar("Bambang", 50, 100, usiapendekar1);
        Pendekar pendekar2 = new Pendekar("Joko", 30, 100, usiapendekar2);

        pendekar1.infoPendekar();
        pendekar2.infoPendekar();

        pendekar1.serang(pendekar2);
        pendekar2.periksaKesehatan();

        pendekar2.latihan();

        pendekar1.istirahat();

        pendekar2.serang(pendekar1);
        pendekar1.periksaKesehatan();
        pendekar2.periksaKesehatan();

        pendekar1.infoPendekar();
        pendekar2.infoPendekar();
    }
}                           