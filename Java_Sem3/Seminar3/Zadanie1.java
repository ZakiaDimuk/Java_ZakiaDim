// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа.
package Seminar3;

import java.util.ArrayList;

public class Zadanie1 {
        public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(18);
        num.add(29);
        num.add(41);
        num.add(53);
        num.add(19);
        num.add(68);
        num.add(87);

        System.out.println("Список целых чисел: " + num);

        num.removeIf(n -> n % 2 == 0);

        System.out.println("Список, где нет чётных чисел: " + num);

    }
}
