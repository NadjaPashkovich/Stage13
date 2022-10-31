package by.itstep.pashka.controller;

import by.itstep.pashka.model.Task04;

import java.util.Scanner;

public class Main4 {
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

        int even = Task04.calcNumberOfEvenElements(array);
        String result1 = String.format("Even elements: " + even);

        int odd = Task04.calcNumberOfOddElements(array);
        String result2 = String.format("\nOdd elements: " + odd);

        System.out.println(result1 + result2);
    }
}

