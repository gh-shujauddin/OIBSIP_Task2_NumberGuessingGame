package com.Shujauddin.NumberGuessingGame;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("LET'S START THE GAME...");

        int total = 0;
        int round1 = round1();
        total += round1;

        if (round1 >= 30) {
            System.out.println("Congratulation, You reached round 2.");
            int round2 = round2();
            total += round2;

            if (round2 >= 30) {
                System.out.println("Congratulations, You reached round 3.");
                int round3 = round3();
                total += round3;

            } else {
                System.out.println("You didn't Qualify for round 3. Play again..");
            }
        } else {
            System.out.println("You didn't Qualify for round 2. Play again..");
        }

        System.out.println("\nYour Total Score is: " + total);
    }

    public static int round1() {
        int randNum = (int) (Math.random() * 100);
        if (randNum%2 == 0) {
            System.out.println("HINT- Even Number.");
        }else {
            System.out.println("HINT- Odd Number.");
        }
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Round 1: You have 10 chances. Guess in 6 chances to reach round 2: ");
        int count = 1;

        while (count != 11) {
            System.out.print("\tChance " + count + ", Enter your guess: ");
            int guessed = sc.nextInt();

            if (guessed > 0 && guessed <= 100) {
                if (guessed == randNum) {
                    System.out.println("\tCongrats.. You guessed it.");
                    score = switch (count) {
                        case 1 -> 50;
                        case 2 -> 50;
                        case 3 -> 40;
                        case 4 -> 40;
                        case 5 -> 30;
                        case 6 -> 30;
                        case 7 -> 20;
                        case 8 -> 20;
                        case 9 -> 10;
                        case 10 -> 10;
                        default -> 0;
                    };
                    break;

                } else if (guessed > randNum) {
                    System.out.println("\tNumber is less than your guess.\n");
                } else {
                    System.out.println("\tNumber is greater than your guess.\n");
                }
                count++;
            } else {
                System.out.println("\tPlease Enter number between 1 and 100.\n");
            }
        }
        System.out.println("\tYour Score in round 1: " + score + "\n\n");
        return score;
    }

    public static int round2() {
        int randNum = (int) (Math.random() * 100);
        if (randNum%2 == 0) {
            System.out.println("HINT- Even Number.");
        }else {
            System.out.println("HINT- Odd Number.");
        }
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Round 2: You have five chances to guess. Guess in three chance to reach Round 3: ");
        int count = 1;
        while (count != 6) {
            System.out.print("\tChance " + count + ", Enter your guess: ");
            int guessed = sc.nextInt();
            if (guessed > 0 && guessed <= 100) {
                if (guessed == randNum) {
                    System.out.println("\tCongrats.. You guessed it.");
                    score = switch (count) {
                        case 1 -> 50;
                        case 2 -> 40;
                        case 3 -> 30;
                        case 4 -> 20;
                        case 5 -> 10;
                        default -> 0;
                    };
                    break;
                } else if (guessed > randNum) {
                    System.out.println("\tNumber is less than your guess.\n");
                } else {
                    System.out.println("\tNumber is greater than your guess.\n");
                }
                count++;
            } else {
                System.out.println("\tPlease Enter number between 1 and 100.\n");
            }
        }
        System.out.println("\tYour Score in round 2: " + score + "\n\n");
        return score;
    }

    public static int round3() {
        int randNum = (int) (Math.random() * 100);
        if (randNum%2 == 0) {
            System.out.println("HINT- Even Number.");
        }else {
            System.out.println("HINT- Odd Number.");
        }
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Round 3: You have three chance to guess, Guess in 2 chances: \n");
        int count = 0;
        while (count != 4) {
            System.out.print("\tChance " + count + ", Enter your guess: ");
            int guessed = sc.nextInt();
            if (guessed > 0 && guessed <= 100) {
                if (guessed == randNum) {
                    System.out.println("Congrats.. You Won the Game.");
                    score = switch (count) {
                        case 1 -> 50;
                        case 2 -> 50;
                        case 3 -> 30;
                        default -> 0;
                    };
                    break;
                } else if (guessed > randNum) {
                    System.out.println("\tNumber is less than your guess.\n");
                } else {
                    System.out.println("\tNumber is greater than your guess.\n");
                }
                count++;
            } else {
                System.out.println("Please Enter number between 1 and 100.\n");
            }
        }
        sc.close();
        System.out.println("Your Score in round 3: " + score);
        return score;
    }
}
