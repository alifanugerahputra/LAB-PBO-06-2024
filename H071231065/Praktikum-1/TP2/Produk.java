public class Produk {
    public String id;
    public String nama;
    public int stok;
    public int harga;

    public Produk(String id, String nama, int stok, int harga) { // constructor untuk menginisialisasikan objek yang baru dibuat
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilkan() {
        System.out.println("\nInfo Produk: ");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga + "\n");
    }
}