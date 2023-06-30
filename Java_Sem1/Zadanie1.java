// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        long sumN = 0;
        long proizvN = 1;
        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
            proizvN = proizvN * i;
        }
        System.out.println("Сумма первых n чисел: " + sumN);
        System.out.println("Произведение n чисел: " + proizvN);
    }
}