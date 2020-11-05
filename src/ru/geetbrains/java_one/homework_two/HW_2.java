package ru.geetbrains.java_one.homework_two;

public class HW_2 {

    private static void printArrayOneDimensional(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Task 1
    private static int[] replaceOneWithZero(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    // Task 2
    private  static int[] arithmeticProgression(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + 3 * i;
        }
        return arr;
    }

    public   static void main(String[] args) {

        // 1
        String multipleLines1 = System.lineSeparator() + "Task 1";
        System.out.println(multipleLines1);
        int[] arr1 = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        int[] arr1Invert = replaceOneWithZero(arr1);
        printArrayOneDimensional(arr1Invert);

        // 2
        String multipleLines2 = System.lineSeparator() + "Task 2";
        System.out.println(multipleLines2);
        int[] arr2 = new int[8];
        int[] arr2Result = arithmeticProgression(arr2);
        printArrayOneDimensional(arr2Result);
    }

}
