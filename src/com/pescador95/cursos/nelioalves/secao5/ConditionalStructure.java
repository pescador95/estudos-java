package com.pescador95.cursos.nelioalves.secao5;

import java.util.Locale;
import java.util.Scanner;

public class ConditionalStructure {

    public static void main(String[] args) {


    }

    public static void exercicio01() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: \n");

        int number = scanner.nextInt();

        if (number > 0) {

            System.out.println("NÃO NEGATIVO");

        } else {
            if (number < 0) {

                System.out.println("NEGATIVO");

            } else {

                System.out.println("NEUTRO");

            }
        }
        scanner.close();
    }

    public static void exercicio02() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: \n");

        int number = scanner.nextInt();

        if (number % 2 == 0) {

            System.out.println("PAR");

        } else {

            System.out.println("IMPAR");

        }
        scanner.close();
    }

    public static void exercicio03() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o produto A: \n");

        int A = scanner.nextInt();

        System.out.println("Digite o produto B: \n");

        int B = scanner.nextInt();

        if (A % B == 0 || B % A == 0) {

            System.out.println("São Múltiplos");

        } else {

            System.out.println("Não são Múltiplos");

        }
        scanner.close();
    }

    public static void exercicio04() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo: \n");

        int horaInicio = scanner.nextInt();

        System.out.println("Digite a hora de finalização do jogo: \n");

        int horasTotais;

        int horaFim = scanner.nextInt();

        if(horaInicio < horaFim){

            horasTotais = horaFim - horaInicio;

        } else {

            horasTotais = 24 - horaInicio + horaFim;

        }

        System.out.println("O Jogo durou " + horasTotais + " horas.");

        scanner.close();
    }

    public static void exercicio05() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o produto digitando o código, e na sequência, a quantidade deste produto que deseja: ");
        System.out.println("---------------------------------------");
        System.out.println("Código      Especificação       Preço  ");
        System.out.println("---------------------------------------");
        System.out.println("1           Cachorro Quente     R$ 4.00");
        System.out.println("2           X-Salada            R$ 4.50");
        System.out.println("3           X-Bacon             R$ 5.00");
        System.out.println("4           Torrada Simples     R$ 2.00");
        System.out.println("5           Refrigerante        R$ 1.50");
        System.out.println("---------------------------------------");

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }

    public static void exercicio06() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }

    public static void exercicio07() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();

    }

    public static void exercicio08() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
