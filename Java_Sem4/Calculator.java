package Java_Sem4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator {
    private static final Object operation = null;
    private static File log;
    private static FileWriter fileWriter;
    /**
     * [3*] Реализовать простой калькулятор
     * @param args аргументы командной строки
     */
    public static void main(String[] args) throws IOException {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите операцию (+ - * / undo): ");
            char op = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            int res;
            switch (op) {
                case '+':
                    res = add(a, b);
                    logStep("Result is: " + res);
                    System.out.println(a + " + " + b + " = " + res);

                    break;
                case '-':
                    res = minus(a, b);
                    logStep("Result is: " + res);
                    System.out.println(a + " - " + b + " = " + res);
                    break;
                case '*':
                    res = multi(a, b);
                    logStep("Result is: " + res);
                    System.out.println(a + " * " + b + " = " + res);
                    break;
                case '/':
                    res = divide(a, b);
                    logStep("Result is: " + res);
                    System.out.println(a + " / " + b + " = " + res);
                    break;
                case 'undo':
                    if (operation.equals("")){
                        System.out.println("Нечего отменять");
                    } else {
                        System.out.println("Отменено: " + result + " " + operation + " " + number);
                        number = result;
                        result = undo(operation, result, number);
                        operation = "";
                    }
                    break;
                default:
                    logStep("Wrong operation!");
                    System.out.println("Wrong operation!");
                    break;
            }
        }
        finally {
            fileWriter.close();
        }
    }

    private static int divide(int a, int b) {
        if (b != 0) return a / b;
        return -1;
    }

    private static int multi(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    
 
    private static int undo(String operation, int a, int b) {
        switch (operation){
            case "+":
                return a-b;
            case "-":
                return a+b;    
            case "*":
                return a/b;
            case "/":
                return a*b;
            default:
                logStep("Wrong operation!");
                System.out.println("Wrong operation!");
                return a;
        }
    }

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }

}