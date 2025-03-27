package src.desafios;

public class InverterApenasLetras {

    public static void main(String... args) {

        String input = "a-bC-dEf-ghIj";

        System.out.println("O resultado é: " + inverterApenasLetras(input));
    }

    static String inverterApenasLetras(String letras) {

        char[] caracteres = letras.toCharArray();

        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {

            if (!Character.isLetter(caracteres[esquerda])) {
                esquerda++;
            }

            if (!Character.isLetter(caracteres[direita])) {
                direita--;
            }

            if (Character.isLetter(caracteres[esquerda]) && Character.isLetter(caracteres[direita])) {
                char temp = caracteres[esquerda];
                caracteres[esquerda] = caracteres[direita];
                caracteres[direita] = temp;
                esquerda++;
                direita--;
            }

        }
        return new String(caracteres);
    }
}
