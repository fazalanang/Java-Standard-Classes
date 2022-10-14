package Java.Standard.Classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Faza");
        builder.append(" ");
        builder.append("Lanang");
        builder.append(" ");
        builder.append("Djati");

        String name = builder.toString();
        System.out.println(name);
    }
}
