package ru.job4j.array;

/**
 * MatrixCheck.
 * Класс для проверки выйгрышных комбинаций в игре сокобан.
 *
 * @author Aleksandr S.(subbotin0035@yandex.ru)
 */

public class MatrixCheck {

    /**
     * метод monoHorizontal должен проверить, что в квадратном массиве есть строчки
     * заполненные только символом 'X'.
     *
     * @param board - массив.
     * @return возращает значение true или false.
     */

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

    /**
     * метод monoVertical должен проверить, что в квадратном массиве есть столбцы
     * заполненные только символом 'X'.
     *
     * @param board - массив.
     * @return возращает значение true или false.
     */

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

    /**
     * метод extractDiagonal должен заполнить одномерный массив
     * элементами диагонали из двухмерного массива.
     *
     * @param board - массив.
     * @return возращает одномерный массив.
     */

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for ( int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }


    /**
     * метод isWin должен определить, что в квадратном массиве
     * есть строчки или столбцы, заполненные только символом 'X'
     *
     * @param board - массив.
     * @return возращает значение true или false.
     */

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
