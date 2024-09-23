import java.util.*;

public class Main {
    public static void main(String[] args) {
        ////Task 1
        System.out.println("Task 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 5, 9, 1, 4, 5, 5, 6, 7));
        List<Integer> newNums = new ArrayList<>(List.of());
        for (Integer i : nums) {
            if (i % 2 != 0) {
                newNums.add(i);
            }
        }
        System.out.println(newNums.toString());

        ////Task 2
        System.out.println();
        System.out.println("Task 2");


        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 10, 20, 20, 1, 1, 6, 6, 6));
        Set<Integer> newNums2 = new HashSet<>(List.of());
        for (Integer i : nums2) {
            if (i % 2 == 0) {
                newNums2.add(i);
            }
        }
        newNums2 = new TreeSet<>(newNums2);
        System.out.println(newNums2.toString());

        ////Task 3
        System.out.println();
        System.out.println("Task 3");

        List<String> string2 = new ArrayList<>(List.of("Собака", "Кошка", "Пес", "Кошка", "Прошел",
                "Дом", "Дерево", "Собака", "Кошка", "Дом", "собака", "кошка", "дом", "Ель", "корова"));
        Set<String> newString2 = new HashSet<>();
        for (String string : string2) {
            if (!newString2.contains(string)) {
                newString2.add(string.toLowerCase());
            }
        }
        System.out.println("Уникальные слова: " + newString2.toString());


        ////Task 4
        System.out.println();
        System.out.println("Task 4");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> newString = new HashMap<>();
        for (String string : strings) {

            if (!newString.containsKey(string)) {
                newString.put(string, 1);
            } else {
                newString.put(string, newString.get(string) + 1);
            }
        }
        System.out.println(newString.values());
    }
}
