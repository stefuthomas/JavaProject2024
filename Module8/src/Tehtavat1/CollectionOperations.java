package Tehtavat1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

public class CollectionOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 5, 8, 20, 15, 3, 12));
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("Odd numbers:");
        numbers.forEach(num -> {
            if (!isEven.test(num)) {
                System.out.println(num);
            }
        });

        System.out.println("Odd numbers doubled:");
        numbers.replaceAll(num -> num % 2 != 0 ? num * 2 : num);
        numbers.forEach(System.out::println);

        final int[] sum = {0};
        numbers.forEach(num -> sum[0] += num);
        System.out.println("Sum of numbers:");
        System.out.print(sum[0]);
    }
}