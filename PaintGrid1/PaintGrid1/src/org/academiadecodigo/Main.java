package org.academiadecodigo;

import org.academiadecodigo.paintgrid.SimpleGFX.Grid;
import org.academiadecodigo.paintgrid.SimpleGFX.Cursor;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {

    public static void main(String[] args) {

        Cursor cursor1 = new Cursor(new Rectangle(10, 10, 10, 10));
        cursor1.cursor();
        Grid.Board();
        new Handler(cursor1);

        int test = (int)Math.round((double)10);
        System.out.println("Test -> " + test);
    }
}
