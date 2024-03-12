package org.example;

//  Напишите метод, который принимает строку и использует лямбда-выражение для проверки,
//  является ли строка палиндромом (читается одинаково в обоих направлениях).

import java.util.function.Predicate;

public class CheckingForPalindrome {
    public static void main(String[] args) {
        String file = "Ettrolootrr";
        Predicate<String> isPalidrome = str -> {
            StringBuilder reversed = new StringBuilder(str).reverse();
            return str.equals(reversed.toString());
        };
        boolean palidrome = isPalidrome.test(file);
        System.out.println(palidrome);
    }
}
