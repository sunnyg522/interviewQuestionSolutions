package dynamicprog;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @project q
 * @authore dgunda on 7/2/18
 */
public class Htree {
    public static void main(String[] args) {
        int n = 7;

        double x = 0.5, y = 0.5;   // center of H-tree
        double size = 0.5;         // side length of H-tree
        draw(n, x, y, size);
    }

    public static void drawH(double x, double y, double size) {
        double x0 = x - size / 2;
        double x1 = x + size / 2;
        double y0 = y - size / 2;
        double y1 = y + size / 2;

        StdDraw.line(x0, y0, x0, y1);    // left  vertical segment of the H
        StdDraw.line(x1, y0, x1, y1);    // right vertical segment of the H
        StdDraw.line(x0, y, x1, y);

    }

    public static void draw(int n, double x, double y, double size) {
        if (n == 0) return;
        drawH(x, y, size);

        double x0 = x - size / 2;
        double x1 = x + size / 2;
        double y0 = y - size / 2;
        double y1 = y + size / 2;

        // recursively draw 4 half-size H-trees of order n-1
        draw(n - 1, x0, y0, size / 2);    // lower left  H-tree
        draw(n - 1, x0, y1, size / 2);    // upper left  H-tree
        draw(n - 1, x1, y0, size / 2);    // lower right H-tree
        draw(n - 1, x1, y1, size / 2);    // upper right H-tree
    }
}
