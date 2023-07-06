// Дан список целых чисел. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package Seminar3;

import java.util.ArrayList;
import java.util.Collections;

public class Zadanie2 {
        public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(15);
        list.add(28);
        list.add(47);
        list.add(50);
        list.add(26);
        list.add(93);

        System.out.println("Список целых чисел: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
