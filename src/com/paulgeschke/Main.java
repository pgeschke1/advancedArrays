package com.paulgeschke;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hot Dog Ingredients:");
        String[] strings = {"Buns", "Hot Dogs", "Ketchup", "Mustard", "Relish"};
        int[] inventory = {5, 6, 4, 3, 2};
        for (int i = 0; i < strings.length; i++) {
            System.out.println((i + 1) + ". " + strings[i] + ": " + inventory[i] + " left");
        }
        System.out.println("Choose Item Number 1-5: ");
        int index;
        int amount;
        Scanner input = new Scanner(System.in);
        index = input.nextInt();
        System.out.println("Enter Item Amount Change: ");
        amount = input.nextInt();
        inventory[index] += amount;
        for (int i = 0; i < strings.length; i++) {
            System.out.println((i + 1) + ". " + strings[i] + ": " + inventory[i] + " left");
        }
    }
}

