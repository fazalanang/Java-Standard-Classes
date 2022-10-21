package Java.Standard.Classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ","{ "," }");
        joiner.add("Faza");
        joiner.add("Lanang");
        joiner.add("Djati");

        String value = joiner.toString();
        System.out.println(value);
    }
}
