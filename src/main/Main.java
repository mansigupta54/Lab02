package main;

/**
 * @author MansiGupta
 * @version 1.0
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine().trim();
        System.out.println("Welcome," + userName + "!");
        scanner.close();
    }
}