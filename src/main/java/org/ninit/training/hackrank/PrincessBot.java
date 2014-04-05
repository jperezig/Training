package org.ninit.training.hackrank;

import java.util.Scanner;

public class PrincessBot {

    private static int[] princess;
    private static String PRINCESS = "p";
    private static String BOT = "m";
    private static int[] current;

    static void displayPathtoPrincess(int n, String[] grid) {
        while (!found()) {
            while (princess[0] > current[0]) {
                down();
            }
            while (princess[0] < current[0]) {
                up();
            }

            while (princess[1] > current[1]) {
                right();
            }
            while (princess[1] < current[1]) {
                left();
            }
        }
    }

    private static boolean found() {
        return princess[0] == current[0] && princess[1] == current[1];
    }

    private static void down() {
        System.out.println("DOWN");
        current[0] = current[0] + 1;

    }

    private static void up() {
        System.out.println("UP");
        current[0] = current[0] - 1;

    }

    private static void left() {
        System.out.println("LEFT");
        current[1] = current[1] - 1;
    }

    private static void right() {
        System.out.println("RIGHT");
        current[1] = current[1] + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for (int i = 0; i < m; i++) {
            grid[i] = in.next();
            int p = grid[i].indexOf(PRINCESS);
            if (p != -1) {
                princess = new int[] { i, p };
            }
            int b = grid[i].indexOf(BOT);
            if (b != -1) {
                current = new int[] { i, b };
            }
        }
        in.close();

        displayPathtoPrincess(m, grid);
    }
}
