package io.codelex.enums.practice;

public enum Direction {
    NORTH("up", 0),
    SOUTH("down", 1),
    EAST("right", 2),
    WEST("left", 3);

    private final String text;
    private final int number;

    Direction(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public int getNumber() {
        return number;
    }
}
