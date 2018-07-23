package main.java.lv.ctco.interview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please enter a positive number!");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                reader.next();
            }
            input = reader.nextInt();
        } while (input <= 0);
        drawTriangle(input);
        reader.close();
    }

    private static void drawTriangle(int input) {
        int spaces;
        int stars;
        if (input % 2 == 1) {
            spaces = input / 2;
            stars = 1;
        } else {
            spaces = input / 2 - 1;
            stars = 2;
        }
        while (stars <= input) {
            printOutSpacesAndStars(stars, spaces);
            stars += 2;
            spaces--;
        }

    }

    private static void printOutSpacesAndStars(int stars, int spaces) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < spaces; i++) {
            result.append(" ");
        }
        for (int i = 0; i < stars; i++) {
            result.append("*");
        }
        System.out.println(result);
    }
}
