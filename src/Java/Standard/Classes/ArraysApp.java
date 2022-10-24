package Java.Standard.Classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,3,64,74,2,74,45,6,2,6,1,9,235,36,8,4
        };
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,8));
        System.out.println(Arrays.binarySearch(numbers,74));
        System.out.println(Arrays.binarySearch(numbers, 80));

        int[] result = Arrays.copyOf(numbers,8);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers,5,10);
        System.out.println(Arrays.toString(result2));
    }
}
