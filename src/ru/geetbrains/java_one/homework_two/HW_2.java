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

    // Task 3
    private  static  int[] multiplication(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return  arr;
    }

    // Task 4
    private static float minNumber(float[] arr) {
        float min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            /*if (min > arr[i]) {
                min = arr[i];
            }*/
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    private static float maxNumber(float[] arr) {
        float max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            /*if (max < arr[i]) {
                max = arr[i];
            }*/
            max = Math.max(max, arr[i]);
        }
        return max;
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

        // 3
        String multipleLines3 = System.lineSeparator() + "Task 3";
        System.out.println(multipleLines3);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr3Result = multiplication(arr3);
        printArrayOneDimensional(arr3Result);

        //4
        String multipleLines4 = System.lineSeparator() + "Task 4";
        System.out.println(multipleLines4);
        float[] arr4 = {3f, 7f, 17.3f, 6.8f, 9f, 1.2f, 1f, 0f, 8.4f, -28f, 4f, 2f};
        float minArr4 = minNumber(arr4);
        float maxArr4 = maxNumber(arr4);
        System.out.println("min= " +minArr4 + "\nmax= " + maxArr4);
    }

}
