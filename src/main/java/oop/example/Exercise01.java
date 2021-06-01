package oop.example;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");

        String[] name = new String[64];
        name[63] = input.next();
        System.out.print("Hello, ");
        System.out.print(name[63]);
        input.close();
        System.out.print(", nice to meet you!");

    }
}
