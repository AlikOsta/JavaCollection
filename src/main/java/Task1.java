
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;


public class Task1 {
    @SuppressWarnings("unchecked")
    public static <T> T[] arrayMapping(T[] array, Function<T, T> function) {
        if (array == null || function == null) {
            return null;
        }

        T[] resultArray = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);

        for (int i = 0; i < array.length; i++) {
            resultArray[i] = function.apply(array[i]);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer[] doubledNumbers = arrayMapping(numbers, x -> x * 2);
        System.out.println(Arrays.toString(doubledNumbers));

        String[] words = {"java", "collection", "mapping"};
        String[] upperWords = arrayMapping(words, String::toUpperCase);
        System.out.println(Arrays.toString(upperWords));
    }
}
