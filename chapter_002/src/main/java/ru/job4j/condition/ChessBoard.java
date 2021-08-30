package ru.job4j.condition;

public class ChessBoard {
    public static int wayLad(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static int wayElephant(int x1, int y1, int x2, int y2) {
        int rs2 = 0;
        if (x1 >= 0 && x1 <= 7 && y1 >= 0 && y1 <= 7) {
            if (x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7) {
                if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                    rs2 = Math.abs(x2 - x1);
                }
            }
        }
        return rs2;
    }
}