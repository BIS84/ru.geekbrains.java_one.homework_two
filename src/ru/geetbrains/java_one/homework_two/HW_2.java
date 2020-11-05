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

    public   static void main(String[] args) {

        // 1
        String multipleLines1 = System.lineSeparator() + "Task 1";
        System.out.println(multipleLines1);
        int[] arr1 = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1};
        int[] arr1Invert = replaceOneWithZero(arr1);
        printArrayOneDimensional(arr1Invert);
    }

}
