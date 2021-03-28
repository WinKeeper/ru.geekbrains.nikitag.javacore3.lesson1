package homework;

import javafx.util.converter.FloatStringConverter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTask {

    public static void main(String[] args) {

        String[] strArr1 = new String[]{"First", "Second", "Third", "Fourth", "Fifth", "Sixth"};
        arrayElementSwap(strArr1, 10, 5);

    }

    //В методе указываем тип дженерик <T> чтобы можно было передать любой вид массива
    public static <T> void arrayElementSwap(T[] arr, int index1, int index2) {
        try {
            //Сохраняем в елемент массива T
            T temp = arr[index1];
            System.out.println(Arrays.toString(arr));
            arr[index1] = arr[index2];
            arr[index2] = temp;
            System.out.println(Arrays.toString(arr));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива. Введите корректные значения");
        }
    }

    //Не совсем понимаю как у нас работает <T> перед объявлением возвратного класса ArrayList.
    // Просто такая запись?
    public static <T> ArrayList<T> arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }


}
