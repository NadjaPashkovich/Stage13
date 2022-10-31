package by.itstep.pashka.model;

public class Task01 {
    public static boolean checkSortAsc(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkSortDesc(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

