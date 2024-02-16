import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> todos = new ArrayList<>();

    public static void main(String[] args) {
    }

        public static void add(String todo){
        if(todos.contains(todo)) {
            System.out.println("Дело " + todo + " уже есть в списке!");
            return;
        }

        todos.add(todo);
            System.out.println("Дело " + todo + " успешно добавлено");
    }
    public static void delete(Integer index){
        if(todos.size() <= index){
            System.out.println("Нет такого индекса!");
            return;
        }
        String todo = todos.get(index);
        todos.remove(index);
        System.out.println("Дело " + todo + " успешно удалено!");
//        add if not exist
//        delete if exist
//        print all
//        print by index

        }
        public static void printAll(){
            for (int i = 0; i < todos.size() ; i++) {
                System.out.println(todos.get(i));
            }
        }
    }


    

