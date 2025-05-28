package InterviewProblems;

import java.util.Scanner;

enum Symbol {
    X, O;
}

class Player {

}

class GameState {
    boolean xWin;
    boolean oWin;
    boolean draw;
    boolean inProgress;

    GameState() {
        this.draw = false;
        this.xWin = false;
        this.oWin = false;
        this.inProgress = true;
    }
}

class Board {

    int rows;
    int cols;
    String grid[][];
    Player player1;
    Player player2;
    GameState gameState;

    Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = "";
            }
        }
    }

}

interface GameStrategy {
    public void strategy(Player player, Board board);
}

class HumanStrategy implements GameStrategy {
    public Scanner scanner = new Scanner(System.in);

    public boolean checkValidMove(Board board, int i, int j, int n, int m) {

        if (i < 0 || j < 0 || i >= n || j >= m || board.grid[i][j] != " ") {
            return false;
        }
        return true;

    }

    public boolean check(Board board, int i, int j, char ch, boolean[][] visited) {
        // check whether the particular symbol has won or not

        // check for diagonal
        // check for entire row
        // check for entire col

        return false;
    }

    public void checkCurrentState(Board board) {
        int n = board.rows;
        int m = board.cols;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == false) {

                    boolean xWin = check(board, i, j, 'X', visited);
                    boolean oWin = check(board, i, j, 'O', visited);

                    if (xWin) {
                        board.gameState.xWin = true;
                        return;
                    } else if (oWin) {
                        board.gameState.oWin = true;
                        return;
                    }
                }
            }
        }

    }

    public void printBoard(Board board) { 

        for (int i = 0; i < board.rows; i++) {
            for (int j = 0; j < board.cols; j++) {
                System.out.println(board.grid[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public void strategy(Player player, Board board) {

        String symbol = this.scanner.nextLine();
        int row = this.scanner.nextInt();
        int col = this.scanner.nextInt();
        boolean check = checkValidMove(board, row, col, board.rows, board.cols);
        if (check) {
            board.grid[row][col] = symbol;
        }
        printBoard(board);
        checkCurrentState(board);
        if (board.gameState.draw) {
            System.out.println("the game has ended in a draw");
        } else if (board.gameState.xWin) {
            System.out.println("X has won the game");
        } else if (board.gameState.oWin) {
            System.out.println("O has won the game");
        }
    }

}

public class tictactoeDesign {
    public static void main(String[] args) {

    }
}
