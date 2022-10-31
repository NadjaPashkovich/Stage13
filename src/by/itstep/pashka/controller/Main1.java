package by.itstep.pashka.controller;

import by.itstep.pashka.model.Task01;

import java.util.Scanner;

public class Main1 {
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

        boolean result1 = Task01.checkSortAsc(array);
        String msg1 = result1 ? "Elements of array sorted ascending"
                : "Elements of array not sorted ascending";
        System.out.println(msg1);


        boolean result2 = Task01.checkSortDesc(array);
        String msg2 = result2 ? "Elements of array sorted descending"
                : "Elements of array not sorted descending";
        System.out.println(msg2);
    }
}
