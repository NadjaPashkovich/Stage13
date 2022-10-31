package by.itstep.pashka.controller;

import by.itstep.pashka.model.Task05;

import java.util.Scanner;

import static by.itstep.pashka.model.Task05.COUNT_STUDENTS;

public class Main5 {
    public static void main(String[] args) {

        int[] array = new int[COUNT_STUDENTS];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Exam Result Handling\nMarks:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("\nExam Result: ");

        int count5 = Task05.findSumFivesMarks(array);
        int count4 = Task05.findSumFoursMarks(array);
        int count3 = Task05.findSumTriplesMarks(array);
        int count2 = Task05.findSumDeucesMarks(array);
        int count1 = Task05.findSumUnitsMarks(array);
        int count0 = Task05.findSumZerosMarks(array);

        double percent5 = Task05.findPercentFivesMarks(array);
        double percent4 = Task05.findPercentFoursMarks(array);
        double percent3 = Task05.findPercentTriplesMarks(array);
        double percent2 = Task05.findPercentDeucesMarks(array);
        double percent1 = Task05.findPercentUnitsMarks(array);
        double percent0 = Task05.findPercentZerosMarks(array);

        String str5 = "fives- " + percent5 + "% " + "(" + count5 + ")";
        String str4 = "\nfours- " + percent4 + "% " + "(" + count4 + ")";
        String str3 = "\ntriplets- " + percent3 + "% " + "(" + count3 + ")";
        String str2 = "\ndeuces- " + percent2 + "% " + "(" + count2 + ")";
        String str1 = "\nunits- " + percent1 + "% " + "(" + count1 + ")";
        String str0 = "\nzeros- " + percent0 + "% " + "(" + count0 + ")";

        String msg = str5 + str4 + str3 + str2 + str1 + str0;
        System.out.println(msg);
    }
}




