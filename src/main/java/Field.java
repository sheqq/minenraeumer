package main.java;

public class Field {
    private final boolean bomb;
    private int bombsSurrounded;

    public Field(boolean bomb) {
        this.bomb = bomb;
    }

    public boolean isBomb() {
        return bomb;
    }

    public int getBombsSurrounded() {
        return bombsSurrounded;
    }

    public void setBombsSurrounded(int bombsSurrounded) {
        this.bombsSurrounded = bombsSurrounded;
    }
}
