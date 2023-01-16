package com.qeeqez.easy;

/**
 * 733. Flood Fill
 * <p>
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 * <p>
 * You are also given three integers sr, sc, and color.
 * You should perform a flood fill on the image starting from the pixel image[sr][sc].
 * <p>
 * To perform a flood fill, consider the starting pixel,
 * plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color),
 * and so on.
 * Replace the color of all of the aforementioned pixels with color.
 * <p>
 * Return the modified image after performing the flood fill.
 */
public class FloodFill733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if (startColor == color) return image;

        fill(image, sr, sc, startColor, color);
        return image;
    }

    void fill(int[][] image, int sr, int sc, int startColor, int color) {
        if (image[sr][sc] == startColor) image[sr][sc] = color;

        if (sc > 0 && image[sr][sc - 1] == startColor) fill(image, sr, sc - 1, startColor, color);
        if (sr > 0 && image[sr - 1][sc] == startColor) fill(image, sr - 1, sc, startColor, color);

        if (image[0].length > sc + 1 && image[sr][sc + 1] == startColor) fill(image, sr, sc + 1, startColor, color);
        if (image.length > sr + 1 && image[sr + 1][sc] == startColor) fill(image, sr + 1, sc, startColor, color);
    }
}

