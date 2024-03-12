package org.example;
import java.util.function.Function;
import java.util.stream.Collectors;
// Напишите метод, который принимает строку и возвращает ее в верхнем регистре с использованием лямбда-выражения.

import java.util.List;

public class ConvertingAStringToUppercase {

    public static void main(String[] args) {
        String file = "HGHHhgfhfhfghghgfhhfghFHFHfhghgf";
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        String upperCaseString = toUpperCase.apply(file);
        System.out.println(upperCaseString);
    }

}
