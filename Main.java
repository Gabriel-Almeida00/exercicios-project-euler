// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        int limite = 1000;
        int soma = encontrarSomaMultiplos(limite);
        System.out.println("A soma dos múltiplos de 3 ou 5 abaixo de " + limite + " é: " + soma);
    }

    public static int encontrarSomaMultiplos(int limite) {
        int soma = 0;
        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
