package com.pluralsight;

public class App {
    public static void main(String[] args) {

//        System.out.printf("%20s", "TRANSACTIONS");
//
//        System.out.println();
//
//        System.out.printf("%18s %-20s%n", "2026-11-04", "Coffee");

        System.out.printf("%25s", "TRANSACTIONS");
        System.out.println();
        System.out.println();
        System.out.printf("| %2s%-2 |  | VENDOR | AMOUNT |", "DATE");
    }

    private static String center(String text, int width) {
        // Used Claude to help me with formatting so each section is a set size
        // This method is drafted using Claude, revised by me for accuracy and judgment
        int leftover = width - text.length();

        if (leftover <= 0) {

            return text;

        }

        int left = leftover / 2;
        int right = leftover - left;

        return " ".repeat(left) + text + " ".repeat(right);

    }
}
