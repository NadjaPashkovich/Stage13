package by.itstep.pashka.model;

public class Task03 {
    public static boolean checkElementEqual(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] == array[i + 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}




