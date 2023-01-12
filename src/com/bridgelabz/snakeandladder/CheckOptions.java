package com.bridgelabz.snakeandladder;

public class CheckOptions {
    public static void main(String[] args) {
        int position = 0;

        int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("DiceNumber is : " + dice);

        int option = (int) Math.floor(Math.random() * 10) % 3;
        System.out.print("Player option is : ");

        switch (option) {
            case 0:
                position += dice;
                System.out.println("Ladder");
                System.out.println("Position of the player after the ladder is : " + position);
                break;

            case 1:
                position -=  dice;
                System.out.println("Snake");
                System.out.println("Position of the player after the Snake is : " + position);
                break;

            case 2:
                System.out.println("No play");
                System.out.println("Position of the player remains same");
                break;
        }

    }
}
