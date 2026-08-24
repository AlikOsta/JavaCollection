import java.util.HashMap;
import java.util.Map;


public class Task2 {

    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> countMap = new HashMap<>();

        if (array == null) {
            return countMap;
        }

        for (T element : array) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        return countMap;
    }

    public static void main(String[] args) {
        String[] words = {"java", "collection", "java", "map", "collection", "java"};
        Map<String, Integer> wordCounts = countElements(words);
        System.out.println("Подсчет строк: " + wordCounts);

        Integer[] numbers = {1, 2, 3, 2, 1, 1, 5, 4, 2};
        Map<Integer, Integer> numberCounts = countElements(numbers);
        System.out.println("Подсчет чисел: " + numberCounts);

    }
}
