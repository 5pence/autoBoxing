package com.spencer;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        int[] myIntegers = readIntegers(count);
        reverse(myIntegers);
    }

    private static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values.\r");
        int[] values = new int[count];
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    private static void reverse(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
        int[] revCopy = array;
        int cell = array.length;
        for(int i = 0; i < revCopy.length / 2; i++)
        {
            int temp = array[i];
            revCopy[i] = revCopy[revCopy.length - i - 1];
            revCopy[revCopy.length - i - 1] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(revCopy));
    }
}
