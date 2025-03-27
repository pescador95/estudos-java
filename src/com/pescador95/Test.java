package com.pescador95;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        forExamples();
    }

    static void forExamples() {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> arrayList = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        /* forma clássica utilizando variável de iteração e a implementação de lista*/
        for (int i = 0; i < arrayList.size(); i++) {
        System.out.println(arrayList.get(i));
        }

        /* forma clássica utilizando variável de iteração e array primitivo*/
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        /* for clássico utilizando uma variável para iterar o array*/
        for (int element : arrayList) {
            System.out.println(element);
        }

        /* utilizando método forEach da implementação do Iterable*/
        arrayList.forEach(element -> System.out.println(element));

        /* forma clássica utilizando variável de iteração e a implementação de lista trás pra frente*/
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }

        /* forma clássica utilizando variável de iteração e array primitivo trás pra frente*/
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
