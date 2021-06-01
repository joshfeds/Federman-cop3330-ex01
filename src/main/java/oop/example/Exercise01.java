package oop.example;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");

        String name = input.next();
        System.out.print("Hello, "+name);
        System.out.print(", nice to meet you!");

    }
}
