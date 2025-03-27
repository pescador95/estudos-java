package src.desafios;

import java.util.Scanner;

public class HashCode {

     public static void main(String... args) {

        printValue();

    }

    public static void printValue(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caracter: ");

        String input = scanner.nextLine();

        System.out.println("O caracter digitado foi :" + input.hashCode());
    }
}
