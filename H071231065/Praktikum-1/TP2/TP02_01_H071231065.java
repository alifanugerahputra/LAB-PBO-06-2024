public class TP02_01_H071231065{
    public static void main(String[] args) {
        Person person = new Person(); // menginstansiasikan objek

        person.setName("Alif");
        person.setAge(21);
        person.setGender(true);
        System.out.println("Nama: " + person.getName());
        System.out.println("Umur: " + person.getAge());
        System.out.println("Male?: " + person.getGender());
    }
}