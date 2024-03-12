package org.example;

//  Создайте список строк и отсортируйте его в алфавитном порядке с использованием лямбда-выражения.

import java.util.ArrayList;
import java.util.List;

public class SortingAListOfStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Glory");
        list.add("unnsoly");
        list.add("Abyyn");
        list.add("Youtin");
        list.add("Borrys");
        list.add("Semon");
        list.add("Zack");
        list.add("Totylisean");
        list.add("Jecky");
        list.add("Popnu");
        list.add("Wody");
        List<String> listSort = new ArrayList<>();
        listSort = list.stream()
                .sorted().toList();
        System.out.println(listSort);

    }

}
