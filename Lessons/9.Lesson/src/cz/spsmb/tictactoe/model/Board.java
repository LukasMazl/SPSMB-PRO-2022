package cz.spsmb.tictactoe.model;

import java.util.Arrays;

public class Board {
    private int width;
    private int height;
    private char[][] board;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new char[height][width];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public void writeValue(int[] coord, char mark) {
        this.board[coord[1]][coord[0]] = mark;
    }

    @Override
    public String toString() {
        return "Board{" +
                "width=" + width +
                ", height=" + height +
                ", board=" + Arrays.toString(board) +
                '}';
    }

}
