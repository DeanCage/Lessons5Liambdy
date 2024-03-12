package org.example;

// Создайте список чисел и используйте лямбда-выражение для фильтрации четных чисел из списка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAListOfNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 122);
        List<Integer> evenNumber = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

}
