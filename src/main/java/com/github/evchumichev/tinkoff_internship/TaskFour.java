package com.github.evchumichev.tinkoff_internship;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        TaskFour instance = new TaskFour();
        List<TaskFour.Rectangle> rectangleList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int matrixSize = 1000;
        boolean[][] matrixGrid = new boolean[matrixSize][matrixSize];
        int rectanglesNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rectanglesNumber; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            rectangleList.add(instance.new Rectangle(x1, y1, x2, y2));
        }
        System.out.println(countRectangleCells(matrixGrid, rectangleList));
        System.out.flush();

    }

    public static int countRectangleCells(boolean[][] matrixGrid, List<TaskFour.Rectangle> rectangleList) {
        int cells = 0;
        for (TaskFour.Rectangle rectangle : rectangleList) {
            for (int x = rectangle.firstAngleXCoordinate; x < rectangle.secondAngleXCoordinate; x++) {
                for (int y = rectangle.firstAngleYCoordinate; y < rectangle.secondAngleYCoordinate; y++) {
                    if (!matrixGrid[x][y]) {
                        matrixGrid[x][y] = true;
                        cells++;
                    }
                }
            }
        }
        return cells;
    }

    class Rectangle {
        int firstAngleXCoordinate;
        int firstAngleYCoordinate;
        int secondAngleXCoordinate;
        int secondAngleYCoordinate;

        public Rectangle(int firstAngleXCoordinate, int firstAngleYCoordinate, int secondAngleXCoordinate, int secondAngleYCoordinate) {
            this.firstAngleXCoordinate = firstAngleXCoordinate;
            this.firstAngleYCoordinate = firstAngleYCoordinate;
            this.secondAngleXCoordinate = secondAngleXCoordinate;
            this.secondAngleYCoordinate = secondAngleYCoordinate;
        }
    }
}
