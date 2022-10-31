package by.itstep.pashka.model;

public class Task02 {
    public static boolean checkPalindromeElementsOfArray(int[] array) {
        for (int j = 0; j < (array.length - 1) / 2; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    return true;

                }
            }
        }
        return false;
    }
}