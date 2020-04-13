package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for ( int i = 0; i<board.length; i++ ) {
            if ( board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for ( int j = 0; j<board.length; j++ ) {
            if ( board[j][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for ( int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }


    public static boolean isWin(char[][] board) {
        boolean result = false;
        int horizontalCells = 0;
        int verticalCells = 0;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 'X') {
                for (int cell = 0; cell < board.length; cell++) {
                    if (board[row][cell] == 'X') {
                        horizontalCells++;
                    }
                    if (board[cell][row] == 'X') {
                        verticalCells++;
                    }
                }
                if (verticalCells == board.length || horizontalCells == board.length) {
                    result = true;
                    break;
                }
                break;
            }

        }
        return result;
    }
}
