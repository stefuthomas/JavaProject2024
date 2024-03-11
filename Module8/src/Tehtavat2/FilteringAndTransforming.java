package Tehtavat2;

import java.util.Arrays;
import java.util.List;

public class FilteringAndTransforming {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(
            numbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(x -> x * 2)
                .sum()
        );
    }
}
