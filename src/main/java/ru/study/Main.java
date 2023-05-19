package ru.study;


public class Main {
    public static void main(String[] args) {
        final int row = 7;
        final int column = 4;
        final int matrixLength = row * column;

        Matrix matrix = new Matrix(row, column);
        System.out.println(matrix);

        for (int i = 0; i < matrixLength; i++) {
            matrix.add(randomInt());
            System.out.println(matrix);
        }
    }

    public static int randomInt() {
        return (int) (Math.random() * 100);
    }
}