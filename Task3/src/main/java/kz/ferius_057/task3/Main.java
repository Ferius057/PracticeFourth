package kz.ferius_057.task3;

import lombok.val;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ferius_057 (Charles_Grozny)
 * @date ⭐ 04.10.2023 | 22:55 ⭐
 */
public class Main {
    public static void main(String[] args) {
        val inputList = List.of(-8, -432, 1, 3, -7, 234, -234, 764, -2, -1, 3, 4, -5, 5, -6, 6, -13);

        System.out.printf("Из %s представленных вот числа больше 5 по модулю:%n", inputList.size());

        moreThanFive(inputList)
                .forEach(System.out::println);
    }

    public static List<Integer> moreThanFive(List<Integer> lst) {
        return lst.stream().filter(e -> Math.abs(e) > 5) // Math.abs() типо выдает все числа как положительные, а я сверяю его по моделю
                .collect(Collectors.toList());
    }
}