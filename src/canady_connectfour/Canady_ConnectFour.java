package canady_connectfour;

import java.util.*;

public class Canady_ConnectFour {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Node a0, a1, a2, a3, a4, a5, a6;
    static Node b0, b1, b2, b3, b4, b5, b6;
    static Node c0, c1, c2, c3, c4, c5, c6;
    static Node d0, d1, d2, d3, d4, d5, d6;
    static Node e0, e1, e2, e3, e4, e5, e6;
    static Node f0, f1, f2, f3, f4, f5, f6;

    static Node[][] a = {
        {a0, a1, a2, a3, a4, a5, a6},
        {b0, b1, b2, b3, b4, b5, b6},
        {c0, c1, c2, c3, c4, c5, c6},
        {d0, d1, d2, d3, d4, d5, d6},
        {e0, e1, e2, e3, e4, e5, e6},
        {f0, f1, f2, f3, f4, f5, f6}
    };

    public static final int h = 6;
    public static final int w = 7;

    public static void main(String[] args) {

    }

    public static void init() {
        for (int i = 0; i < h; i++) { //height outer
            for (int j = 0; j < w; j++) { //width outer
                boolean up = false, down = false, left = false, right = false;

                if (i < h - 1) { //if not bottom
                    down = true;
                    a[i][j].setD(a[i + 1][j]);
                }
                if (j < w - 1) { //if not right
                    right = true;
                    a[i][j].setR(a[i][j + 1]);
                }
                if (i != 0) { //if not top
                    up = true;
                    a[i][j].setU(a[i - 1][j]);
                }
                if (j != 0) { //if not left
                    left = true;
                    a[i][j].setL(a[i][j - 1]);
                }
                if (up && left) {
                    a[i][j].setUl(a[i - 1][j - 1]);
                }
                if (up && right) {
                    a[i][j].setUr(a[i - 1][j + 1]);
                }
                if (down && left) {
                    a[i][j].setDl(a[i + 1][j - 1]);
                }
                if (down && right) {
                    a[i][j].setDr(a[i + 1][j + 1]);
                }
            }
        }
    }

    public static void print() {

    }

    public static void input() {

    }

}
