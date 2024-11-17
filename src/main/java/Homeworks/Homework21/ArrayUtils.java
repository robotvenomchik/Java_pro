package Homeworks.Homework21;

public class ArrayUtils {

    @MethodInfo(name = "sumArray", returnType = "int", description = "Calculates the sum of all elements in an array.")
    @Author(firstName = "Kyrylo", lastName = "Venomchik")
    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    @MethodInfo(name = "findMax", returnType = "int", description = "Finds the maximum value in an array.")
    @Author(firstName = "Kyrylo", lastName = "Venomchik")
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

