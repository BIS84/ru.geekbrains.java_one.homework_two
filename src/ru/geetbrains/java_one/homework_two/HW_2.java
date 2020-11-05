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

    // Task 5
    private static int[][] diagonalSquare(int[][] arr) {
        int j = arr.length - 1;
        for (int i = 0; i <= j; i++) {
            arr[i][i] = 1;
            arr[i][j-i] = 1;
        }
        return arr;
    }

    private static void printArrayTwoDimensional(int[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Task 6
    private  static boolean equalParts(int[] arr) {
        int a = 0;
        int b = 0;
        int i = 0;
        int j = arr.length -1;
        while (i <= j) {
            if (a <= b) {
                a += arr[i];
                i++;
            } else {
                b += arr[j];
                j--;
            }
         }
        return (a == b);
    }

    // Task 7
    private static int[] cyclicalDisplacement(int[] arr, int n) {

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (i = 0; i < arr.length; i++) {
                int j = i + n;
                if (j > arr.length - 1) {
                    while (j > arr.length - 1) {
                        j -= arr.length;
                    }
                } else if (j < 0) {
                    while (j < 0) {
                        j += arr.length;
                    }
                }
                arr2[j] = arr[i];
            }
        }
        return arr2;
    }

    // Task 8
    private static int[] cyclicalDisplacement2(int[] arr, int n) {

        if (n > arr.length - 1) {
            while (n > arr.length - 1) {
                n -= arr.length;
            }
        } else if (n < -arr.length + 1) {
            while (n < -arr.length + 1) {
                n += arr.length;
            }
        }
        int a = arr[0];
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = k - n;
            if (j > arr.length) {
                j -= arr.length;
            } else  if (j < 0) {
                j += arr.length;
            }
            arr[k] = arr[j];
            k = j;
        }
        arr[k] = a;
        return  arr;
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

        // 5
        String multipleLines5 = System.lineSeparator() + "Task 5";
        System.out.println(multipleLines5);
        int[][] arr5 = new int[9][9];
        int[][] arr5Result = diagonalSquare(arr5);
        printArrayTwoDimensional(arr5Result);

        // 6
        String multipleLines6 = System.lineSeparator() + "Task 6";
        System.out.println(multipleLines6);
        int[] a = {3, 2, 2, 8, 27, 4, 2, 17, 2, 16, 1};
        System.out.println(equalParts(a));

        // 7
        String multipleLines7 = System.lineSeparator() + "Task 7";
        System.out.println(multipleLines7);
        int n = -3;
        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr7Result = cyclicalDisplacement(arr7, n);
        printArrayOneDimensional(arr7Result);

        // 8
        String multipleLines8 = System.lineSeparator() + "Task 8";
        System.out.println(multipleLines8);
        int[] arr8Result = cyclicalDisplacement2(arr7, n);
        printArrayOneDimensional(arr8Result);
    }

}
