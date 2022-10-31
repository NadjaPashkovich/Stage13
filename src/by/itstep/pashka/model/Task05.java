package by.itstep.pashka.model;

public class Task05 {
    public static final int COUNT_STUDENTS = 30;

    public static int findSumFivesMarks(int[] array) {
        int i;
        int count5 = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                count5++;
            }
        }
        return count5;
    }

    public static int findSumFoursMarks(int[] array) {
        int i;
        int count4 = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                count4++;
            }
        }
        return count4;
    }

    public static int findSumTriplesMarks(int[] array) {
        int i;
        int count3 = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                count3++;
            }
        }
        return count3;
    }

    public static int findSumDeucesMarks(int[] array) {
        int i;
        int count2 = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                count2++;
            }
        }
        return count2;
    }

    public static int findSumUnitsMarks(int[] array) {
        int i;
        int count1 = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count1++;
            }
        }
        return count1;
    }

    public static int findSumZerosMarks(int[] array) {
        int i;
        int count0 = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count0++;
            }
        }
        return count0;
    }


    public static double findPercentFivesMarks(int[] array) {
        int i;
        double percent5 = 0;
        int count5 = Task05.findSumFivesMarks(array);
        for (i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                percent5 = (double) (count5 * 100) / COUNT_STUDENTS;
            }
        }
        return percent5;
    }

    public static double findPercentFoursMarks(int[] array) {
        int i;
        double percent4 = 0;
        int count4 = Task05.findSumFoursMarks(array);
        for (i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                percent4 = (double) (count4 * 100) / COUNT_STUDENTS;
            }
        }
        return percent4;
    }

    public static double findPercentTriplesMarks(int[] array) {
        int i;
        double percent3 = 0;
        int count3 = Task05.findSumTriplesMarks(array);
        for (i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                percent3 = (double) (count3 * 100) / COUNT_STUDENTS;
            }
        }
        return percent3;
    }

    public static double findPercentDeucesMarks(int[] array) {
        int i;
        double percent2 = 0;
        int count2 = Task05.findSumDeucesMarks(array);
        for (i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                percent2 = (double) (count2 * 100) / COUNT_STUDENTS;
            }
        }
        return percent2;
    }

    public static double findPercentUnitsMarks(int[] array) {
        int i;
        double percent1 = 0;
        int count1 = Task05.findSumUnitsMarks(array);
        for (i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                percent1 = (double) (count1 * 100) / COUNT_STUDENTS;
            }
        }
        return percent1;
    }

    public static double findPercentZerosMarks(int[] array) {
        int i;
        double percent0 = 0;
        int count0 = Task05.findSumZerosMarks(array);
        for (i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                percent0 = (double) (count0 * 100) / COUNT_STUDENTS;
            }
        }
        return percent0;
    }
}



