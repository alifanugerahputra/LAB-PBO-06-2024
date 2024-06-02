import java.util.Scanner;

public class MoneyMachine {
    private String nama;
    private double saldo;

    public MoneyMachine(String nama, double saldoAwal) {
        this.nama = nama;
        this.saldo = saldoAwal;
    }

    private  static void tarikSaldo(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            cetakStruk(jumlah, "Penarikan");
        } else {
            System.out.println("Maaf, saldo Anda tidak cukup untuk melakukan penarikan.");
        }
    }

    private  static void transferSaldo(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            cetakStruk(jumlah, "Transfer");
        } else {
            System.out.println("Maaf, saldo Anda tidak cukup untuk melakukan transfer.");
        }
    }

    private void cetakStruk(double jumlah, String tipeTransaksi) {
        System.out.printf("Halo %s!\n", nama);
        System.out.printf("Anda telah melakukan %s sebesar Rp %.2f\n", tipeTransaksi, jumlah);
        System.out.printf("Saldo tersisa: Rp %.2f\n", saldo);
        System.out.println("Terima kasih telah menggunakan MoneyMachine!");
    }

    public void jalankanATM() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        this.nama = scanner.nextLine();

        while (true) {
            System.out.println("\nPilih salah satu:");
            System.out.println("1. Tarik saldo");
            System.out.println("2. Transfer saldo");
            System.out.print("Input pilihan anda: ");
            int pilihan = scanner.nextInt();
            
            System.out.print("Masukkan nominal yang ingin di" + (pilihan == 1 ? "tarik: Rp " : "transfer: Rp "));
            double jumlah = scanner.nextDouble();

            if (pilihan == 1) {
                tarikSaldo(jumlah);
            } else if (pilihan == 2) {
                transferSaldo(jumlah);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.println("\nIngin melanjutkan transaksi lain? (yes/no)");
            scanner.nextLine();  
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Sesi ATM selesai. Selamat tinggal!");
    }

    public static void main(String[] args) {
        MoneyMachine atm = new MoneyMachine("User", 1000000); 
        atm.jalankanATM();
    }
}