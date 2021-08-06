package Lesson1;

import java.util.Scanner;

public class HelloName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        System.out.printf("Hello, %s!", scanner.nextLine());
    }
}
