package com.github.evchumichev.tinkoff_internship;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coverLength = scanner.nextInt();
        int coverHeight = scanner.nextInt();
        int cardLength = scanner.nextInt();
        int cardHeight = scanner.nextInt();
        int coverSpace = coverLength * cardHeight;
        int cardSpace = cardLength * cardHeight;

        if (coverSpace < cardSpace || cardHeight > coverHeight || cardHeight > coverLength || cardLength > coverHeight || cardLength > coverLength) {
            System.out.println("NO");
            System.out.flush();
            return;
        }
        System.out.println("YES");
        System.out.flush();
    }
}
