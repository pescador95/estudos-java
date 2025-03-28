package src.bigO;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MaiorSequencia {

    public static void main(String... args) {

        int[] intArray = {100, 6, 7, 8, 4, 200, 1, 2, 3, 5, 9, 10, 300};

        List<Integer> sequencia = Arrays.stream(intArray)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("A maior sequência numérica é: " + maiorSequencia(sequencia));
    }

    public static Integer maiorSequencia(List<Integer> numeros) {

        Set<Integer> numerosSet = new HashSet<>(numeros);
        final Integer[] sequenciaMaxima = {0};

        numeros.forEach(numero -> {

            if (!numerosSet.contains(numero - 1)) {
                int incidenciaAtual = 0;
                int finalNumeroAtual = numero;
                while (numerosSet.contains(finalNumeroAtual + 1)) {
                    finalNumeroAtual++;
                    incidenciaAtual++;
                    sequenciaMaxima[0] = Math.max(sequenciaMaxima[0], incidenciaAtual);
                }
            }
        });

        return sequenciaMaxima[0];
    }
}
