import java.util.Scanner;

public class aTicTacToeGame {
    private static final char EMPTY = '-';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private char[][] board;
    private char currentPlayer;

    public aTicTacToeGame() {
        board = new char[3][3];
        currentPlayer = PLAYER_X;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || col < 0 || row >= 3 || col >= 3 || board[row][col] != EMPTY) {
            System.out.println("This move is not valid");
            return false;
        } else {
            board[row][col] = currentPlayer;
            return true;
        }
    }

    public boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        System.out.println("Welcome to Tic-Tac-Toe!");

        while (!gameEnded) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (makeMove(row, col)) {
                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("The game is a tie!");
                    gameEnded = true;
                } else {
                    changePlayer();
                }
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        aTicTacToeGame game = new aTicTacToeGame();
        game.playGame();
    }
}
