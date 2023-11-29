package com.kotenko.data.structure;

import java.util.Arrays;

public class The2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        char[][] boardTwo = new char[][]{
                new char[]{'0', '-', '_'},
                new char[]{'0', '-', '_'},
                new char[]{'0', '-', '_'},
        };

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
