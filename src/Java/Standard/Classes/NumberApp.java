package Java.Standard.Classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        String contoh = "1000";

        Double contohInt = Double.valueOf(contoh);
        System.out.println(contohInt);
    }
}
