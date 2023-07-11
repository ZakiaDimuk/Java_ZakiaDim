package Java_Sem4;

import java.util.LinkedList;
import java.util.Scanner;
public class Zadanie2 {
    /**
     * @return
     */
    public static LinkedList<Object> fillList(){
        final LinkedList<Object> list = new LinkedList<>();
        list.add("Старт");
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("Конец");
        return list;
    }
    /**
     * @param que
     */
    public static void printList(LinkedList<Object> que){
        for(Object el: que){
            System.out.printf(el + " ");
        }
        System.out.println();
    }
    public static void enqueue(Deque<Object> list){
        System.out.println("Введите элемент, который необходимо добавить: ");
        Scanner sc1 = new Scanner(System.in);
        Object element = sc1.nextLine();
        list.addLast(element);
        sc1.close();
    }
    public static Object dequeue(Deque<Object> list){
        Object item = list.pollFirst();
        return item;
    }
    public static Object first(Deque<Object> list){
        return list.peekFirst();
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Object> que = new LinkedList<>();
        que = fillList();
        printList(que);
        System.out.println("Введите номер операции: 1 — поместить элемент в конец очереди; 2 — вернуть первый элемент из очереди и удалить его; 3 — вернуть первый элемент из очереди, не удаляя; 4 — завершение работы");
        while(true){
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if (cmd == 1){
                enqueue(que);
                printList(que);
                continue;
            }
            if (cmd == 2) {
                System.out.println("Первый элемент: " + dequeue(que));
                printList(que);
                continue;
            }
            if (cmd == 3){
                System.out.println("Первым элементом был: " + first(que));
                continue;
            }
            if (cmd == 4) break;
            else {
                System.out.println("Для выхода из программы введите 4");
            }
            sc.close();
        }
    }
    @Override
    public String toString() {
        return "Zadanie2 []";
    }
}
