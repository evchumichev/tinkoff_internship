package com.github.evchumichev.tinkoff_internship;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputCharsArray = scanner.nextLine().toCharArray();
        int interpretation = 1;
        for (int i = 0; i < inputCharsArray.length; i++) {
            if (i == inputCharsArray.length - 1 || inputCharsArray[i] == '0') {
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(inputCharsArray[i]).append(inputCharsArray[i+1]);
            int number = Integer.parseInt(stringBuilder.toString());
            if (number >= 1 && number <= 33) {
                interpretation++;
            }
        }
        System.out.println(interpretation);
        System.out.flush();
    }
}
