package cz.spsmb.tictactoe;

import cz.spsmb.tictactoe.logic.TicToc;
import cz.spsmb.tictactoe.model.Board;
import cz.spsmb.tictactoe.model.Player;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Board board = new Board(10, 10);
        Player x = new Player("Danek", 'X', 25);
        Player y = new Player("Vanek", 'O', 2500);

        TicToc ticToc = new TicToc(board, new Player[]{x, y});
        ticToc.startGame();
    }
}
