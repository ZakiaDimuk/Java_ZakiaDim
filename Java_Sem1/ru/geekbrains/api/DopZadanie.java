package ru.geekbrains.api;

import java.util.Scanner;

public class DopZadanie {
    public static void main(String[] args){
        stroka();
    }
    
    static void stroka(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        boolean f = scan.hasNextInt();
        if (f){
            int a = scan.nextInt();
            System.out.println("Вы ввели число: " + a);
            scan.nextLine();
        }
        else{
            System.out.println("Вы ввели некорректное число, повторите попытку ввода");
            scan.nextLine();
        }
        
        System.out.println("Введите строку 1 ");
        String str1 = scan.nextLine();
        System.out.println("Введите строку 2 ");
        String str2 = scan.nextLine();
        System.out.println("Введите число");
        int i = scan.nextInt();
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(i);
    }

}