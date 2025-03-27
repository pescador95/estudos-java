package src.desafios;

import src.bigO.FactorialRecursive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Combinacoes {

    public static void main(String... args) {

        try {

            int tamanho = 60;
            int minimo = 1;
            int maximo = 100;

            int[] vetorAleatorio = gerarVetorAleatorio(tamanho, minimo, maximo);

            gerarCombinacoesOrdenadas(vetorAleatorio);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void gerarCombinacoesOrdenadas(int[] vetor) {

        Arrays.sort(vetor);

        boolean[] utilizado = new boolean[vetor.length];

        gerarCombinacoesRecursivas(vetor, new int[vetor.length], 0, utilizado);

        imprimirInformacoesVetor(vetor);
    }

    private static void gerarCombinacoesRecursivas(int[] vetor, int[] combinacaoAtual, int indice, boolean[] utilizado) {

        if (indice == vetor.length) {
            imprimirCombinacao(combinacaoAtual);
            return;
        }

        for (int i = 0; i < vetor.length; i++) {

            if (!utilizado[i]) {
                combinacaoAtual[indice] = vetor[i];
                utilizado[i] = true;
                gerarCombinacoesRecursivas(vetor, combinacaoAtual, indice + 1, utilizado);
                utilizado[i] = false;
            }
        }
    }
    public static int[] gerarVetorAleatorio(int tamanho, int minimo, int maximo) {
        if (tamanho <= 0 || maximo - minimo + 1 < tamanho) {
            throw new IllegalArgumentException("Parâmetros inválidos.");
        }

        int[] vetor = new int[tamanho];
        Set<Integer> numerosGerados = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
            } while (numerosGerados.contains((Object) numeroAleatorio));

            vetor[i] = numeroAleatorio;
            numerosGerados.add(numeroAleatorio);
        }

        return vetor;
    }

    private static void imprimirInformacoesVetor(int[] vetor) {

        System.out.println();

        System.out.print("Vetor Aleatório: [ ");

        for (int valor : vetor) {
            System.out.print(valor);
        }
        System.out.println("]");

        System.out.println("Número de elementos: " + vetor.length);
        System.out.println("número de possibilidades: " + FactorialRecursive.factorial((long) vetor.length));

        System.out.println();
    }

    private static void imprimirCombinacao(int[] combinacao) {
        for (int valor : combinacao) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

}