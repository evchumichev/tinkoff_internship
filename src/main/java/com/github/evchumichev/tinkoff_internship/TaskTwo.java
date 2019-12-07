package com.github.evchumichev.tinkoff_internship;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                stringBuilder.append(c);
            }
        }
        int i = 0;
        int j = stringBuilder.length() - 1;
        while (i++ < j--) {
            if (stringBuilder.charAt(i) != stringBuilder.charAt(j)) {
                System.out.println("NO");
                System.out.flush();
                return;
            }
        }
        System.out.println("YES");
        System.out.flush();
    }
}
