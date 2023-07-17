package org.academiadecodigo.paintgrid.SimpleGFX;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    private static final int SQUARE_SIZE = 10;
    private static final int ROWS = 50;
    private static final int COLS = 50;
    private static final int PADDING = 10;
    public static final Rectangle[][] boardSquares = new Rectangle[ROWS][COLS];

    private static boolean rainbowMode = false;

    // TODO: We must save the Rectangles in a file so that we can load a previous sketch

    public static void Board() {
        for (int xPosition = 0; xPosition < boardSquares.length; ++xPosition) {

            for (int yPosition = 0; yPosition < boardSquares[xPosition].length; ++yPosition) {
                Rectangle rectangle = new Rectangle(PADDING + SQUARE_SIZE * yPosition, PADDING + SQUARE_SIZE * xPosition, SQUARE_SIZE, SQUARE_SIZE);
                rectangle.setColor(Color.BLACK);
                boardSquares[xPosition][yPosition] = rectangle;

                rectangle.draw();
            }
        }
    }

    public static void paintSquare(int y, int x) {
        Color squareColor = rainbowMode ? getRandomColor() : Color.BLACK;
        Rectangle square = boardSquares[(x / PADDING) - 1][(y / PADDING) - 1];
        square.setColor(squareColor);
        square.fill();
    }

    private static Color getRandomColor() {
        // TODO: Must return a random color; You should use the Math.round(Math.random) technique...
        return Color.RED;
    }

    public static void setRainbowMode() {
        rainbowMode = !rainbowMode;
    }
}