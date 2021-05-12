package study;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static char human = 'X';
    public static char ai = '0';
    public static char emptyField = '_';

    public static Scanner pencil = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {
	    createMap();
	    printMap();
        while (true) {

            turnHuman();
            printMap();
            if (win(human)) {
                System.out.println("Human win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Draw!");
                break;
            }

            turnAi();
            printMap();

            if (win(ai)) {
                System.out.println("AI win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Draw!");
                break;
            }
        }
        System.out.println("Game over!");
    }

    public static void createMap() {
        mapSizeX = 5;
        mapSizeY = 5;
        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = emptyField;
            }
        }
    }

    public static void printMap() {
        System.out.print(" ");

        for (int i = 0; i < mapSizeX * 2 + 1; i++) {
            String str = " ";

            if (i % 2 != 0) {
                str = String.valueOf(i / 2 + 1);
            }
            System.out.print(str);
        }
        System.out.println();

        for (int y = 0; y < mapSizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void turnHuman() {
        int x;
        int y;

        do {
            System.out.print("Enter your coordinates from 1 before " + mapSizeX + " : ");
            x = pencil.nextInt() - 1;
            y = pencil.nextInt() - 1;

        } while (!validField(y, x) || !emptyField(y, x));
        map[y][x] = human;
        System.out.println("Your move in [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static void turnAi() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX); //[0;5)
            y = random.nextInt(mapSizeY); //[0;5)
        } while (!emptyField(y, x));

        map[y][x] = ai;
        System.out.println("AI move in [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static boolean win(char player) {
        int winComb = 4;

        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                boolean result =
                        checkLeftDiagonal(i, j, player, winComb) ||
                        checkRightDiagonal(i, j, player, winComb) ||
                        checkVertical(i, j, player, winComb) ||
                        checkHorizontal(i, j, player, winComb);

                if (result) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkLeftDiagonal(int y, int x, char player, int winComb) {
        boolean possible = y + winComb - 1 < mapSizeY && x + winComb - 1 < mapSizeX;

        if (possible) {
            for(int i = 0; i < winComb; i++) {
                if (map[y + i][x + i] != player) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public static boolean checkRightDiagonal(int y, int x, char player, int winComb) {
        boolean possible = y - winComb + 1 >= 0 && x + winComb - 1 < mapSizeX;

        if (possible) {
            for(int i = 0; i < winComb; i++) {
                if (map[y - i][x + i] != player) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public static boolean checkVertical(int y, int x, char player, int winComb) {
        boolean possible = x + winComb - 1 < mapSizeX;

        if (possible) {
            for(int i = 0; i < winComb; i++) {
                if (map[y][x + i] != player) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public static boolean checkHorizontal(int y, int x, char player, int winComb) {
        boolean possible = y + winComb - 1 < mapSizeY;

        if (possible) {
            for(int i = 0; i < winComb; i++) {
                if (map[y + i][x] != player) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public static boolean fullMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean validField(int y, int x) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean emptyField(int y, int x) {
        return map[y][x] == emptyField;
    }

}