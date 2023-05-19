package ru.study;

import java.util.Arrays;

public class Matrix {
    private final int row;
    private final int column;
    private final int[][] matrix;
    private final BaseEntry<Integer, Integer> lastIndex;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
        lastIndex = new BaseEntry<>(0, 0);
    }

    public void add(int value) {
        if (lastIndex.getKey() < row) {
            if (lastIndex.getValue() < column) {
                matrix[lastIndex.getKey()][lastIndex.getValue()] = value;
                lastIndex.setValue(lastIndex.getValue() + 1);

                if (lastIndex.getValue() == column) {
                    lastIndex.setKey(lastIndex.getKey() + 1);
                    lastIndex.setValue(0);
                }
            }

        } else {
            throw new MatrixIndexOutOfBoundsException("Unable to add new value to matrix, because matrix is fulfilled");
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix);
    }
}