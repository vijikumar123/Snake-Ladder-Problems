package com.bridgelabz.snakeandladder;

public class RollsTheDie {
    public static void main(String[] args) {
        int randomCheck = (int) Math.floor(Math.random ()* 10) % 6+1;
        System.out.println(randomCheck);
    }

}
