package Homeworks.Homework19;

import java.util.Arrays;
import java.util.Random;

import static Homeworks.Homework19.ArrayUtils.binarySearch;
import static Homeworks.Homework19.ArrayUtils.mergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Оригінальний масив:");
        System.out.println(Arrays.toString(array));

        mergeSort(array);
        System.out.println("Відсортований масив:");
        System.out.println(Arrays.toString(array));

        int target = array[5];
        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("Значення " + target + " знайдено на індексі " + result);
        } else {
            System.out.println("Значення " + target + " не знайдено в масиві");
        }

    }
}
