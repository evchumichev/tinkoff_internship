package com.github.evchumichev.tinkoff_internship;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int x1 = scanner.nextInt() - 1;
        int y1 = scanner.nextInt() - 1;
        int x2 = scanner.nextInt() - 1;
        int y2 = scanner.nextInt() - 1;
        int[] array = new int[n];

        fillInArray(array, n);
        swap(x1, y1, array);
        swap(x2, y2, array);
        printArray(array);
    }

    private static void swap(int x, int y, int[] array) {
        while (x < y) {
            int tmp = array[x];
            array[x] = array[y];
            array[y] = tmp;
            x++;
            y--;
        }
    }

    private static void fillInArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.flush();
    }
}
