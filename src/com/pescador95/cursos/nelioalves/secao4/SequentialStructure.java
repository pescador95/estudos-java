package com.pescador95.cursos.nelioalves.secao4;

import java.util.Locale;
import java.util.Scanner;


public class SequentialStructure {

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);

        Boolean shouldIRun = Boolean.TRUE;

        System.out.println("Digite o número do exercício a executar: \n");
        excercises();

        switch (scanner.nextInt()) {
            case 1:
                exercise01(shouldIRun);
                menu();
            case 2:
                exercise02(shouldIRun);
                menu();
            case 3:
                exercise03(shouldIRun);
                menu();
            case 4:
                exercise04(shouldIRun);
                menu();
            case 5:
                exercise05(shouldIRun);
                menu();
            case 6:
                exercise06(shouldIRun);
                menu();
            case 0:
                return;
            default:
                System.out.println("Opção inválida.");
                return;
        }
    }


    public static void excercises(){

        System.out.println("1 - Soma de inteiros");
        System.out.println("2 - Cálculo de área");
        System.out.println("3 - Diferença de produto");
        System.out.println("4 - Cálculo de salário");
        System.out.println("5 - Cálculo valor da peça");
        System.out.println("6 - Cálculo tringulo, circulo, trapezio, quadrado,retangulo");
        System.out.println("\n0 - Finalizar");

    }

    /**
     * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
     * mensagem explicativa.
     */
    public static void exercise01(Boolean execute) {

        if (!execute){
            return;
        }

        Scanner scanner = new Scanner(System.in);

        Integer number1, number2, sum;

        try {

            System.out.println("Exercício 1: Soma de inteiros\n");

            System.out.println("Digite o primeiro número: ");

            number1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");

            number2 =  scanner.nextInt();

            if (number1.describeConstable().isEmpty() || number2.describeConstable().isEmpty()){
                throw new RuntimeException("Os números são inválidos.");
            }

            sum = number1 + number2;

            System.out.println("\nSoma = " + sum);

            scanner.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    /**
     * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
     * casas decimais conforme exemplos.
     * Fórmula da área: area = π . raio2
     * Considere o valor de π = 3.14159
     *
     */
    public static void exercise02(Boolean execute)  {

        if (!execute){
            return;
        }

        Scanner scanner = new Scanner(System.in);

        Double pi = Math.PI, ray, area;

        try {

            System.out.println("Exercício 2: Cálculo de área\n");

            System.out.println("Digite o tamanho do raio de um circulo: ");

            ray = scanner.nextDouble();

            if (ray.describeConstable().isEmpty() || ray.isInfinite() || ray.isNaN()) {

                throw new Exception("Ocorreu um problema ao resgatar o valor do raio.");

            }

            area = pi * Math.pow(ray, 2);

            System.out.println("\nA=" + area);

            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
     * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
     */
    public static void exercise03(Boolean execute) {

        if (!execute){
            return;
        }

        Integer A, B, C, D, dif;

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Exercício 3: Diferença de produto\n");

            System.out.println("Digite o valor de A: ");

            A = scanner.nextInt();

            System.out.println("Digite o valor de B: ");

            B = scanner.nextInt();

            System.out.println("Digite o valor de C: ");

            C = scanner.nextInt();

            System.out.println("Digite o valor de D: ");

            D = scanner.nextInt();

            if (A.describeConstable().isEmpty() || B.describeConstable().isEmpty() || C.describeConstable().isEmpty() || D.describeConstable().isEmpty()){
                throw new RuntimeException("A entrada de dados contém números inválidos.");
            }

            dif = A * B - C * D;

            System.out.println("\nDiferença = " + dif);

            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
     * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
     * decimais.
     *
     */
    public static void exercise04(Boolean execute) {

        if (!execute) {
            return;
        }

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 4: Cálculo de salário\n");

        Integer number, hours;

        Double hourlyRate, salary;

        try {

            System.out.println("Digite o número de um funcionário: ");

            number = scanner.nextInt();

            System.out.println("Digite o número horas trabalhadas: ");

            hours = scanner.nextInt();

            System.out.println("Digite o valor/hora: ");

            hourlyRate = scanner.nextDouble();

            salary = hourlyRate * hours;

            System.out.println("\nNúmero = " + number);
            System.out.printf("Salário = U$ %.2f%n", salary);

            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
     * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
     */
    public static void exercise05(Boolean execute) {

        if (!execute) {
            return;
        }

        Scanner scanner = new Scanner(System.in);

        Integer code1, quantity1, price1, code2, quantity2, price2, total;

        try {

            System.out.println("Exercício 5: Valores das peças\n");

            System.out.println("Digite o primeiro código da peça 1: ");

            code1 = scanner.nextInt();

            System.out.println("Digite quantidade da peça 1: ");

            quantity1 = scanner.nextInt();

            System.out.println("Digite o preço da peça 1: ");

            price1 = scanner.nextInt();

            System.out.println("Digite o primeiro código da peça 2: ");

            code2 = scanner.nextInt();

            System.out.println("Digite quantidade da peça 2: ");

            quantity2 = scanner.nextInt();

            System.out.println("Digite o preço da peça 2: ");

            price2 = scanner.nextInt();

            if (code1.describeConstable().isEmpty() || quantity1.describeConstable().isEmpty() || code2.describeConstable().isEmpty() || quantity2.describeConstable().isEmpty()){
                throw new RuntimeException("Os números são inválidos.");
            }

            total = quantity1 * price1 + quantity2 * price2;

            System.out.println("Peça 1: ");
            System.out.println("quantidade: " + quantity1);
            System.out.println("preço: " + price1);

            System.out.println("Peça 2: ");
            System.out.println("quantidade: " + quantity2);
            System.out.println("preço: " + price2);

            System.out.printf("Valor a pagar: R$ %.2f%n", total);

            scanner.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    /**
     * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
     * mostre:
     * a) a área do triângulo retângulo que tem A por base e C por altura.
     * b) a área do círculo de raio C. (pi = 3.14159)
     * c) a área do trapézio que tem A e B por bases e C por altura.
     * d) a área do quadrado que tem lado B.
     * e) a área do retângulo que tem lados A e B.
     *
     */
    public static void exercise06(Boolean execute) {

        if (!execute) {
            return;
        }

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Double a, b, c, triangle, circle, trapeze, square, rectangle;

        Double pi = Math.PI;


        try {

            System.out.println("Exercício 6: Cálculos\n");

            System.out.println("Digite o valor de A: ");

            a = scanner.nextDouble();

            System.out.println("Digite o valor de B: ");

            b = scanner.nextDouble();

            System.out.println("Digite o valor de C: ");

            c = scanner.nextDouble();

            if (a.describeConstable().isEmpty() || b.describeConstable().isEmpty() || c.describeConstable().isEmpty()){
                throw new RuntimeException("Os valores são inválidos.");
            }

            triangle = a * c / 2.0;
            circle = pi * c * c;
            trapeze = (a + b) / 2.0 * c;
            square = b * b;
            rectangle = a * b;

            System.out.printf("Triangulo: %.3f%n", triangle);
            System.out.printf("Circulo: %.3f%n", circle);
            System.out.printf("Trapezio: %.3f%n", trapeze);
            System.out.printf("Quadrado: %.3f%n", square);
            System.out.printf("Retangulo: %.3f%n", rectangle);

            scanner.close();

    } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



}

