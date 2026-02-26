//package org.example.mastermind.Frontend;
//
//import java.util.Scanner;
//
//public class UserInterface {
//    Scanner scanner = new Scanner(System.in);
//
//    public void printMainMenu() {
//        System.out.println("Welcome to Mastermind!");
//        System.out.println();
//        gameMenu2();
//    }
//
//    private void gameMenu2() {
//        while (true) {
//            System.out.println("Please enter 1 to play");
//            String choice = scanner.nextLine();
//            if (!choice.equals("1")) {
//                System.out.println("wrong input");
//            }
//        } else {
//            startGame();
//        }
//
//}
//
//    private void startGame() {
//        while (true) {
//            System.out.println("Play against a friend(1), or AI(2)");
//            String choice = scanner.nextLine();
//            if (choice.equals("1")) {
//                friendGame();
//            }
//            else if (choice.equals("2")) {
//                aiGame();
//            } else {
//                System.out.println("wrong input");
//            }
//        }
//    }
//
//    private void aiGame() {
//        while (true) {
//
//        }
//    }
//
//    private void friendGame() {
//    }
//}
