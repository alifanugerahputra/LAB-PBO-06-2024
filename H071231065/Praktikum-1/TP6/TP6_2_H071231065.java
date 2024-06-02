interface Dog {
    void move();
    void describe();
}

abstract class Dogbase implements Dog {
    protected int position;
    protected int averageLength;

    public Dogbase(int position, int averageLength) {
    this.position = position;
    this.averageLength = averageLength;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }
}

class Pitbull extends Dogbase {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
System.out.println("Pitbull berpindah sejauh " + position + " titik");
    }

    @Override
    public void describe() {
        System.out.println("Pitbull adalah jenis anjing yang terkenal dengan kekuatan, kelincahan, dan kesetiaannya.");
        System.out.println("Pitbull memiliki ciri fisik seperti rahang yang kuat, otot yang kokoh, dan bulu yang pendek");
        System.out.println("Panjang rata-rata Pitbull adalah " + averageLength + " Cm.");
    }
}

class SiberianHusky extends Dogbase {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
System.out.println("Husky berpindah sejauh " + position + " titik");
    }

    @Override
    public void describe() {
        System.out.println("Siberian Husky adalah jenis anjing yang terkenal dengan ketahanan, kecerdasan, dan keramahannya.");
        System.out.println("Siberian Husky memiliki bulu tebal dan panjang, mata berwarna biru, dan telinga yang tegak.");
        System.out.println("Panjang rata-rata Siberian Husky adalah " + averageLength + " Cm.");
    }
}

class Bulldog extends Dogbase {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 1;
System.out.println("Bulldog berpindah sejauh " + position + " titik");
    }

    @Override
    public void describe() {
        System.out.println("Bulldog adalah jenis anjing yang terkenal dengan kekuatan, keuletan, dan kelembutannya.");
        System.out.println("Bulldog memiliki rahang kuat, tubuh kekar, dan wajah keriput.");
        System.out.println("Panjang rata-rata Bulldog adalah " + averageLength + " Cm.");
    }
}

class GermanShepherd extends Dogbase {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
System.out.println("German sepherd berpindah sejauh " + position + " titik");
    }

    @Override
    public void describe() {
        System.out.println("German Shepherd adalah jenis anjing yang terkenal dengan kecerdasa, kesetiaan, dan keberaniannya.");
        System.out.println("German Shepherd memiliki bulu lebat, tubuh ramping, dan telinga tegak.");
        System.out.println("Panjang rata-rata German Spepherd adalah " + averageLength + " Cm.");
    }
}

// Interface Movable
interface Movable {
    void move();
    }

class Smartphone implements Movable {
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone " + brand + " naik ke harga " + price);
    }
}

class Car implements Movable {
    private int totalForwardGear;
    private String color;
    private int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil " + color + " dengan Forward Gear " + totalForwardGear + " sedang berakselerasi, dengan kecepatan maksimum " + maxSpeed + " Km/h");
    }
}

public class TP6_2_H071231065 {
    public static void main(String[] args) {
        Dog pitbull = new Pitbull(0, 60);
        Dog husky = new SiberianHusky(0, 55);
        Dog bulldog = new Bulldog(0, 50);
        Dog shepherd = new GermanShepherd(0, 65);

        Movable smartphone = new Smartphone(10000, "iPhone");
        Movable car = new Car(5, "black", 200);
        
        System.out.println();
        moveAndDescribe(pitbull);
        System.out.println();

        moveAndDescribe(husky);
        System.out.println();

        moveAndDescribe(bulldog);
        System.out.println();

        moveAndDescribe(shepherd);
        System.out.println();

        moveObject(smartphone);
        moveObject(car);
        System.out.println();
    }



    private static void moveAndDescribe(Dog dog) {
        dog.move();
        dog.describe();

    }

    private static void moveObject(Movable movable) {
        movable.move();
    }
}