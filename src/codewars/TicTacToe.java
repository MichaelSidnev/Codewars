package codewars;

import java.util.Scanner;

public class TicTacToe {
    static char symbol;
    static char fpSymbol;
    static char spSymbol;
    static char[][] board = new char[3][3];
    static boolean exit = false;

    public static void game() {
        System.out.println("Welcome to the Tic-Tac-Toe game.");
        symbolChooser();
        gameStarter();
        placeChooser();
    }

    public static void symbolChooser() {
        System.out.print("Enter first player symbol: ");
        Scanner sc = new Scanner(System.in);
        String emptyCatcher;
        while (true) {
            emptyCatcher = sc.nextLine();
            if (emptyCatcher.isEmpty()) {
                System.out.print("Enter something: ");
            } else {
                break;
            }
        }
        fpSymbol = emptyCatcher.charAt(0);

        System.out.print("Enter second player symbol: ");
        while (true) {
            emptyCatcher = sc.nextLine();
            if (emptyCatcher.isEmpty()) {
                System.out.print("Enter something: ");
            } else {
                break;
            }
        }
        while (true) {
            spSymbol = emptyCatcher.charAt(0);
            if (spSymbol == fpSymbol) {
                System.out.print("This symbol is already in use. Try again: ");
            } else {
                break;
            }
        }
        symbol = fpSymbol;
    }

    public static void gameStarter() {

        int a = 0;
        System.out.println("  abc");
        for (char[] board : board) {
            System.out.print(a + " ");
            a++;
            System.out.println(board);
        }
    }

    public static void placeChooser() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            char firstCharCoordinate = 'd';
            int secondCoordinate;
            String emptyCatcher;
            System.out.println("Player " + symbol + "! It's your turn!");
            System.out.print("Enter your first game coordinates: ");
            while (true) {
                emptyCatcher = scanner.nextLine();
                if (emptyCatcher.isEmpty()) {
                    System.out.print("Enter something: ");
                } else {
                    break;
                }
            }
            while (true) {
                firstCharCoordinate = emptyCatcher.charAt(0);
                if (firstCharCoordinate != 'a' && firstCharCoordinate != 'b' && firstCharCoordinate != 'c') {
                    System.out.print("Wrong character, please try again: ");
                } else {
                    break;
                }
            }

            System.out.print("Enter your second game coordinates: ");
            while (true) {
                emptyCatcher = scanner.nextLine();
                if (emptyCatcher.isEmpty()) {
                    System.out.print("Enter something: ");
                } else {
                    break;
                }
            }
            while (true) {
                secondCoordinate = Character.getNumericValue(emptyCatcher.charAt(0));
                if (!(secondCoordinate < 3 && secondCoordinate >= 0)) {
                    System.out.print("Wrong digit, please try again: ");
                } else {
                    break;
                }
            }

            int firstInt = convert(firstCharCoordinate);
            if (Character.isAlphabetic(board[secondCoordinate][firstInt])) {
                System.out.print("The Place has already taken");
                placeChooser();
            }
            board[secondCoordinate][firstInt] = symbol;
            winnerCheck();

            if (exit) System.exit(0);

            symbol = (symbol == spSymbol) ? fpSymbol : spSymbol;
            gameStarter();

        }
    }

    public static int convert(char letter) {
        if (letter == 'a') {
            return 0;
        }
        if (letter == 'b') {
            return 1;
        }
        if (letter == 'c') {
            return 2;
        }
        return 0;
    }

    public static String winnerCheck() {

        for (int a = 0; a < 3; a++) {
            if (board[a][0] == symbol && board[a][1] == symbol && board[a][2] == symbol) {
                System.out.println("Player " + symbol + " win!");
                exit = true;
            }
        }
        for (int b = 0; b < 3; b++) {
            if (board[0][b] == symbol && board[1][b] == symbol && board[2][b] == symbol) {
                System.out.println("Player " + symbol + " win!");
                exit = true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            System.out.println("Player " + symbol + " win!");
            exit = true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            System.out.println("Player " + symbol + " win!");
            exit = true;
        }
        return "Player " + symbol + " win!";
    }

    public static void main(String[] args) {
        game();
    }
}
// секонд координейт
// ввод пустоты
// боты

//убрана ошибка при вводе более 1 символа в бук координату, теперь используется только певый символ.
//убрана ошибка при вводе бук в числ координату.
//убрана ошибка при вводе пустоты
