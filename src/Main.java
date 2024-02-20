import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> todos = new ArrayList<>();

    public static void main(String[] args) {
        todos.add("Купить молока");
        todos.add("Купить колбасы");
        todos.add("Купить курсы java у инфоцыган");
        todos.add("Купить кирпич");

        add("Что-то сделать");
        printByIndex(3);
        printAll();
    }

    public static void add(String todo) {
        if (todos.contains(todo)) {
            System.out.println("Дело " + todo + " уже есть в списке!");
            return;
        }

        todos.add(todo);
        System.out.println("Дело " + todo + " успешно добавлено");
    }

    public static void delete(Integer index) {
        if (!checkIndex(index)) {
            System.out.println("Нет такого индекса!");
            return;
        }
        String todo = todos.get(index);
        todos.remove(todo);
        System.out.println("Дело " + todo + " успешно удалено!");
//        add if not exist
//        delete if exist
//        print all
//        print by index

    }
    public static void printAll() {
        for (String todo : todos) {
            System.out.println(todo);
        }
    }
    public static void printByIndex(Integer index) {
        if (!checkIndex(index)) {
            System.out.println("Нет такого дела!");
            return;
        }
        System.out.println("Дело под индексом " + index + ": " + todos.get(index));
    }
    private static boolean checkIndex(Integer index) {
        return todos.size() > index;
    }
}



    

