package org.example;


// Создайте список чисел и используйте лямбда-выражение для вычисления среднего значения списка.

import java.util.Arrays;
import java.util.List;

public class CalculatingTheAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 231, 323, 656, 33, 222, 8878, 546);
        double listAVR = list.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(listAVR);
    }
}
