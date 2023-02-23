package com.qeeqez.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku
 * <p>
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * <p>
 * Note:
 * * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * * Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku36 {

    // 100% CPU, 92% MEM
    public boolean isValidSudoku(char[][] board) {
        boolean[] digitsRow;
        boolean[] digitsColumn;
        boolean[] digitsBox;

        for (int i = 0; i < board.length; i++) {
            digitsRow = new boolean[10];
            digitsColumn = new boolean[10];
            for (int j = 0; j < board[i].length; j++) {
                char cRow = board[i][j];
                if (!isDot(cRow)) {
                    cRow -= '0';
                    if (digitsRow[cRow]) return false;
                    else digitsRow[cRow] = true;
                }

                char cColumn = board[j][i];
                if (cColumn != '.') {
                    cColumn -= '0';
                    if (digitsColumn[cColumn]) return false;
                    else digitsColumn[cColumn] = true;
                }
            }
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                digitsBox = new boolean[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[i + y * 3][j + x * 3];
                        if (!isDot(c)) {
                            c -= '0';
                            if (digitsBox[c]) return false;
                            else digitsBox[c] = true;
                        }
                    }
                }
            }
        }

        return true;
    }

    // 33% CPU, 54% MEM
    public boolean isValidSudokuSlow(char[][] board) {
        Set<String> digits = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (isDot(c)) continue;

                if (!digits.add(c + " in row" + i)
                        || !digits.add(c + " in column" + j)
                        || !digits.add(c + " in box" + i / 3 + ":" + j / 3)
                ) return false;
            }
        }
        return true;
    }

    private boolean isDot(char c) {
        return c == '.';
    }
}

