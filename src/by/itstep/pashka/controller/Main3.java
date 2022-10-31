package by.itstep.pashka.controller;

import by.itstep.pashka.model.Task03;

import java.util.Scanner;

public class Main3 {
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

        boolean result = Task03.checkElementEqual(array);
        String msg = result ? "Elements of array are equal"
                : "Elements of array are different";

        System.out.println(msg);
    }
}
