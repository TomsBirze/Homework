package io.codelex.enums.practice;

public class DirectionApp {
    public static void main(String[] args) {
        Direction north = Direction.NORTH;
        Direction south = Direction.SOUTH;
        Direction east = Direction.EAST;
        Direction west = Direction.WEST;
        System.out.println(north + ":" + north.getText() + ":" + north.getNumber());
        System.out.println(south + ":" + south.getText() + ":" + south.getNumber());
        System.out.println(east + ":" + east.getText() + ":" + east.getNumber());
        System.out.println(west + ":" + west.getText() + ":" + west.getNumber());
    }
}
