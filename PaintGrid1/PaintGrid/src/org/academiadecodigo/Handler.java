package org.academiadecodigo;

import org.academiadecodigo.paintgrid.SimpleGFX.Cursor;
import org.academiadecodigo.paintgrid.SimpleGFX.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class Handler implements KeyboardHandler {

    public Cursor cursor;
    public Keyboard keyboard;

    public Color[] availableColors = new Color[] {
            Color.BLACK,
            Color.RED,
            Color.BLUE,
            Color.PINK,
            Color.YELLOW,
            Color.GREEN
    };

    public Handler(Cursor cursor) {
        this.cursor = cursor;
        keyboard = new Keyboard(this);
        moves();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
                cursor.moveUP();
                break;

            case KeyboardEvent.KEY_DOWN:
                keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
                cursor.moveDOWN();
                break;

            case KeyboardEvent.KEY_LEFT:
                keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
                cursor.moveLEFT();
                break;

            case KeyboardEvent.KEY_RIGHT:
                keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
                cursor.moveRIGHT();
                break;

            case KeyboardEvent.KEY_C:
                keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
                Grid.setRainbowMode();
                break;

            case KeyboardEvent.KEY_SPACE:
                keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
                cursor.paint();
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void moves() {

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);

        KeyboardEvent changeColor = new KeyboardEvent();
        changeColor.setKey(KeyboardEvent.KEY_C);
        changeColor.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(changeColor);
    }
}




