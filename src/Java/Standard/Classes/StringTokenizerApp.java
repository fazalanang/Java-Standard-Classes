package Java.Standard.Classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String value = "Faza Lanang Djati";

        StringTokenizer tokenizer = new StringTokenizer(value," ");

        while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
        value.split(" ");
    }
}
