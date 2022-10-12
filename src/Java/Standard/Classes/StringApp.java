package Java.Standard.Classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Faza Lanang Djati";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Faza"));
        System.out.println(name.endsWith("Djati"));

        String[] names = name.split(" ");
        for (var value : names){
            System.out.println(value);
        }
    }
}
