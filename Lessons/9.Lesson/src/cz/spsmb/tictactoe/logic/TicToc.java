package cz.spsmb.tictactoe.logic;

import cz.spsmb.tictactoe.model.Board;
import cz.spsmb.tictactoe.model.Player;

import java.util.Scanner;

public class TicToc {
    private Board board;
    private Player[] players;
    private Scanner scanner;
    private Player currentPlayer;
    private int currentPlayerIndex;

    public TicToc(Board board, Player[] players) {
        this.board = board;
        this.players = players;
        this.currentPlayerIndex = 0;
        this.scanner = new Scanner(System.in);
    }

    private int readInputValue(int minValue, int maxValue) {
        int x;
        do {
            x = scanner.nextInt();
            if(x < minValue || x >= maxValue) {
                System.out.println("You selected wrong input value");
            }
        } while (x < minValue || x >= maxValue);
        return x;
    }

    private int[] getPlayerCoord() {
        int x = readInputValue(0, board.getWidth());
        int y = readInputValue(0, board.getHeight());
        return new int[] {x, y};
    }

    public void startGame() {
        System.out.println("Game is staring right now!");
        do {
            printBoardToConsole();
            currentPlayer = players[(currentPlayerIndex++) % players.length];
            System.out.format("Player with name %s is on the turn.", currentPlayer.getName());
            int[] coord = getPlayerCoord();
            this.board.writeValue(coord, currentPlayer.getMark());
        } while (!isEnded());
    }

    private void printBoardToConsole() {
        char[][] board = this.board.getBoard();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                System.out.printf("|%c|", board[i][j]);
            }
            System.out.println();
        }
    }

    private boolean isEnded() {
        return false;
    }
}
