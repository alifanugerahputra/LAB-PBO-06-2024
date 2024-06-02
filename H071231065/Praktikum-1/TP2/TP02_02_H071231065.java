import java.util.Scanner;

public class TP02_02_H071231065 {
  public static void main(String[] args) {
    Produk brownies = new Produk("BR01", "Brownies", 20, 20000);
    Produk cookies = new Produk("CKS01", "Cookies", 20, 5000);
    Produk mochi = new Produk("MCH01", "Mochi Bites", 20, 15000);
  
  Scanner scanner = new Scanner(System.in);

  System.out.print("Masukkan nama produk (Brownies/Cookies/Mochi Bites): ");
  String inputan = scanner.nextLine();

  switch (inputan) {
    case "Brownies":
      brownies.tampilkan();
      break;
    case "Cookies":
      cookies.tampilkan();
      break;
    case "Mochi Bites":
      mochi.tampilkan();
      break;
    default: 
      System.out.println("Produk tidak tersedia");
      break;
  }
  scanner.close();
  }
}