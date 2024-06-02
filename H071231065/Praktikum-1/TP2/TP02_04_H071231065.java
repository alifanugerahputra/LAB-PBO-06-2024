public class TP02_04_H071231065 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Toddopuli Raya";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Dien Fadiyah";
        mahasiswa.nim = "H071231024";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("Nim: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat());
    }
}

class Alamat {
    String jalan;
    String kota;

    public String getJalan() {
        return jalan;
    }

    public String getKota() {
        return kota;
    }

    public String getAlamat() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.getAlamat();
    }
}