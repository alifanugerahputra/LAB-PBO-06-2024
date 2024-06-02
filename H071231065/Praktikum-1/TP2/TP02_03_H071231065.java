import java.util.Scanner;

class Cuboid{
    double height;
    double widht;
    double length;
    
    double getVolume(){
        return height * widht * length;
    }
}
public class TP02_03_H071231065{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cuboid cuboid = new Cuboid();
    cuboid.height = sc.nextDouble();
    cuboid.widht = sc.nextDouble();
    cuboid.length = sc.nextDouble();
    
    
    System.out.printf("Volume = %.2f", cuboid.getVolume());
    sc.close();
    }
}