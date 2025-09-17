import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("a");
        li.add("1");
        li.add("b");
        li.add("2");
        li.add("c");
        li.add("3");
        
        List<String> li_1 = new ArrayList<>(); // для букв
        List<String> li_2 = new ArrayList<>(); // для чисел
        
        // Разделяем список на буквы и числа
        for (int i = 0; i < li.size(); i++) {
            if (i % 2 == 0) {
                li_1.add(li.get(i)); // четные индексы - буквы
            } else {
                li_2.add(li.get(i)); // нечетные индексы - числа
            }
        }
