package by.itstep.pashka.model;

public class Task04 {
    public static int calcNumberOfEvenElements(int[] array) {
        int even = 0;

        for (int element : array) {
            if (element % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static int calcNumberOfOddElements(int[] array) {
        int odd = 0;

        for (int element : array) {
            if (element % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }
}























