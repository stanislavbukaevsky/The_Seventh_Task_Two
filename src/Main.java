import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Задание 1

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println("Нечетные числа: " + nums.get(i));
            }
        }

        //Задание 2

        List<Integer> numsTwo = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int i = 0; i < numsTwo.size(); i++) {
            if (numsTwo.get(i) % 2 == 0 && numsTwo.contains(i)) {
                System.out.println("Четные числа: " + numsTwo.get(i));
            }
        }

        //Задание 3

        Set<String> uniqueWords = new HashSet<String>(List.of("понедельник", "вторник", "среда", "среда", "четверг", "пятница", "пятница", "суббота", "воскресенье", "воскресенье"));

        for (String result : uniqueWords) {
            System.out.println("Уникальные слова: " + result);
        }

        //Задание 4

        List<String> uniqueWordTwo = new ArrayList<>(List.of("понедельник", "вторник", "среда", "среда", "четверг", "пятница", "пятница", "суббота", "воскресенье", "воскресенье"));
        int count = 0;

        for (int i = 0; i < uniqueWordTwo.size(); i++) {
            for (int j = 0; j < uniqueWordTwo.size(); j++) {
                if (uniqueWordTwo.get(i).equals(uniqueWordTwo.get(j))) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}