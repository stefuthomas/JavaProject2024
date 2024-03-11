package Tehtavat2;

import java.util.Arrays;
import java.util.List;

public class CalculateMean {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(32, 14, 63, 25, 74, 94, 38, 28);
        double mean = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);
        System.out.println(mean);
    }
}
