package by.itstep.pashka.controller;

import by.itstep.pashka.model.Task02;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Input size elements of array: ");
            size = scanner.nextInt();
        } while (size < 0);

        int[] array = new int[size];

        System.out.print("Input array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        boolean result = Task02.checkPalindromeElementsOfArray(array);
        String msg = result ? "Elements of array are sorted in a mirror image relative to its middle"
                : "No, elements of array  are not sorted in a mirror image relative to its middle";
        System.out.println(msg);


    }
}
