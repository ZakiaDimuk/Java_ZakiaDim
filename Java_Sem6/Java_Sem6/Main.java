package Java_Sem6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<Cat> catSet = new HashSet<>();

        Cat cat1 = new Cat("Timosha", 4);
        Cat cat2 = new Cat("Bekki", 2);
        Cat cat3 = new Cat("Timosha", 4);
        Cat cat4 = new Cat("Sonya", 5);
        Cat cat5 = new Cat("Barsik", 3);

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);

        for (Cat cat : catSet) {
            System.out.println(cat.getName() + ": " + cat.getAge() + "years");
        }
    }
}
