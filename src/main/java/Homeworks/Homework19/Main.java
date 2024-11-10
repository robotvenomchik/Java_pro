package Homeworks.Homework19;

import java.util.Arrays;
import java.util.Random;

import static Homeworks.Homework19.ArrayUtils.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Original masive:");
        System.out.println(Arrays.toString(array));

        mergeSort(array);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(array));

        int target = array[5];
        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("value " + target + " found on index " + result);
        } else {
            System.out.println("value " + target + " not found");
        }

        boolean sorted = isSorted(array);
        System.out.println("Is the array sorted? " + sorted);
    }
}
