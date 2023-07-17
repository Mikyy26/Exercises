package org.academiadecodigo.paintgrid.SimpleGFX;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor {

    // TODO: Improve the random numbers being used along all the methods!

    private final Rectangle player;

    public Cursor(Rectangle player) {
        this.player = player;
    }

    public void cursor() {
        player.setColor(Color.RED);
        player.fill();
    }

    public void moveUP() {
        if (player.getY() > 10) {
            player.translate(0, -10);
        }
    }

    public void moveDOWN() {
        if (player.getY() < 500) {
            player.translate(0, 10);
        }
    }

    public void moveLEFT() {
        if(player.getX() > 10) {
            player.translate(-10, 0);
        }
    }

    public void moveRIGHT() {
        if (player.getX() < 500) {
            player.translate(10, 0);
        }
    }

    public void paint() {
        Grid.paintSquare(player.getX(), player.getY());
    }
}
