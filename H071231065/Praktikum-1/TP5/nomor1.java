import java.util.Scanner;

class BangunDatar {
    double luas;

    void hitungluas() {
    }
}

class BangunRuang extends BangunDatar {

    double volume;

    void hitungluas() {

    }
}
class Persegi extends BangunDatar {
    double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    void hitungluas(){
        luas = sisi * sisi;

    }
}
class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;

    }
    void hitungluas() {
        luas = panjang * lebar;
    }
}

class Kubus extends BangunRuang{
    double sisi;

    Kubus(double sisi) {
        this.sisi=sisi;    
    }

    void hitungluas() {
        luas = 6 * Math.pow(sisi, 2);
    }

    void hitungVolume(){
        volume = Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar =lebar;
        this.tinggi = tinggi;   
    }

    void hitungluas() {
        luas = 2 * (panjang * lebar * panjang * tinggi * lebar * tinggi);
    }

    void hitungVolume() {
        volume = panjang * lebar * tinggi;  
    }
}

class Bola extends BangunRuang {
    double jariJari;
    
    public Bola(double jariJari) {
        this.jariJari = jariJari;

    }
    void hitungluas() {
        luas  = 4 * Math.PI * jariJari * jariJari; 
    }

    void hitungVolume() {
        volume = (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    } 
}

class Tabung extends BangunRuang {
    double jariJari, tinggi;
    double luas, volume;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    void hitungluas() {
        luas = 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
    
    void hitungVolume() {
        volume =Math.PI * jariJari * jariJari * tinggi; 
    }
}

class lingkaran extends BangunDatar {
    double jariJari;

    lingkaran (double jariJari) {
        this.jariJari = jariJari;
    }

    void hitungluas() {
        luas = Math.PI * jariJari * jariJari;
    }
}

class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4;
    double tinggi;

    Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    void hitungluas() {
        double setengahAlas = (sisi1 + sisi2) / 2;
        double luasTrapesium = setengahAlas * tinggi;
        System.out.println("Luas trapesium: " + luasTrapesium);
    }

    void hitungKeliling() {
        double keliling = (sisi1 + sisi2) / 2;
        System.out.println("Keliling trapesium: " + keliling);
    }
}


class nomor1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;

    System.out.println("----------------------------------");
    System.out.println(("========BANGUN RUANG ========="));
    System.out.println("1. KUBUS");
    System.out.println("2. BALOK");
    System.out.println("3. BOLA");
    System.out.println("4. TABUNG");
    System.out.println("=======BANGUN DATAR========");
    System.out.println("5. PERSEGI");
    System.out.println("6. PERSEGI PANJANG");
    System.out.println("7. LINGKARAN");
    System.out.println("8. TRAPESIUM");
    System.out.println("-------------------------------");

    System.out.println("Masukan pilihan Anda ");
    pilihan = scanner.nextInt();

switch ( (pilihan)) {
    case 1: //kubus
        System.out.println("Masukan sisi kubus: ");
        double sisiKubus = scanner.nextDouble();

        Kubus kubus = new Kubus(sisiKubus);
        kubus. hitungluas();
        kubus.hitungVolume();

        System.out.println("luas kubus " + kubus.luas);
        System.out.println("volume kubus: " + kubus.volume);
        break;
    case 2: // Balok
        System.out.println("Masukan panjang balok");
        double panjangBalok = scanner.nextDouble();

        System.out.println("Masukan Lebar balok");
        double lebarBalok = scanner.nextDouble();

        System.out.println("Masukan tinggi balok");
        double tinggiBalok = scanner.nextDouble();

        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        balok.hitungluas();
        balok.hitungVolume();

        System.out.println("Luas balok: " + balok.luas);
        System.out.println("Volume balok: " + balok.volume);
        break;

    case 3: // Bola
        System.out.println("Masukan jari-jari bola : ");
        double jarijariBola = scanner.nextDouble();

        Bola bola = new Bola(jarijariBola);
        bola.hitungluas();
        bola.hitungVolume();

        System.out.println("Luas bola: " + bola.luas);
        System.out.println("Volume bola: " + bola.volume);
        break;

    case 4: //Tabung
        System.out.println("Masukan jari-jari tabung: ");
        double jarijariTabung = scanner.nextDouble();

        System.out.println("Masukan tinggi tabung");
        double tinggiTabung = scanner.nextDouble();

        Tabung tabung = new Tabung(jarijariTabung, tinggiTabung);
        tabung.hitungluas();
        tabung.hitungVolume();

        System.out.println("Masukan sisi persegi: " + tabung.luas);
        System.out.println("Volume tabung: " + tabung.volume);
        break;

    case 5://Persegi
        System.out.println("Masukan sisi persegi ");
        double sisiPersegi = scanner.nextDouble();

        Persegi persegi = new Persegi(sisiPersegi);
        persegi.hitungluas();

        System.out.println("Luas persegi: " + persegi.luas);
        break;

    case 6:// Persegi Panjang
        System.out.println("Masukan sisi perseg Panjang : ");
        double panjangPersegiPanjang = scanner.nextDouble();

        System.out.println("Masukan lebar persegi panjang: ");
        double lebarPersegiPanjang = scanner.nextDouble();

        PersegiPanjang PersegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        PersegiPanjang.hitungluas();

        System.out.println("Luas persegi panjang: " + PersegiPanjang.luas);
        break;

    case 7: //Lingkaran
        System.out.println("Masukan jari-jaru lingkaran: ");
        double jariJariLingkaran = scanner.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
        lingkaran.hitungluas();

        System.out.println("Luas lingkaran: " + lingkaran.luas);
        break;

    case 8: // Trapesium
        System.out.println("Masukan sisi 1 terapesium: ");
        double sisi1Trapesium = scanner.nextDouble();

        System.out.println("Masukan sisi 2 trapesium: ");
        double sisi2trapesium = scanner.nextDouble();

        System.out.println("Masukan sisi3 trapesium: ");
        double sisi3Trapesium = scanner.nextDouble();

        System.out.println("masukan sisi 4 trapesium: ");
        double sisi4trapesium = scanner.nextDouble();

        System.out.println("Masukan tinggi trapesium: ");
        double tinggiTrapesium = scanner.nextDouble();

        Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2trapesium, sisi3Trapesium, sisi4trapesium, tinggiTrapesium);

        trapesium.hitungluas();

        trapesium.hitungKeliling();

        break;

        }
        scanner.close();


    }

}