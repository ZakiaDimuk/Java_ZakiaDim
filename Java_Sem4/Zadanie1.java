package Java_Sem4;
// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список
import java.util.Collections;
import java.util.LinkedList;

public class Zadanie1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        final LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList); // [c, b, a]
    }

    /**
     * @param list
     * @return
     */
    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}