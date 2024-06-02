public class UsiaPendekar {
    private int tahunLahir;

    // Konstruktor tanpa parameter dengan inisialisasi default
    public UsiaPendekar() {
        this.tahunLahir = 2000; // Inisialisasi default
    }

    // Konstruktor dengan parameter
    public UsiaPendekar(int tahunLahir) {
        this.tahunLahir = tahunLahir; // Menggunakan parameter yang diberikan
    }

    // Getter
    public int getTahunLahir() {
        return tahunLahir;
    }

    // Setter
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    // Metode untuk menghitung usia
    public int hitungUsia(int tahunSekarang) {
        return tahunSekarang - tahunLahir; // Menghitung usia berdasarkan tahun lahir dan tahun saat ini
    }
}