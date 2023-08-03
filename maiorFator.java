
public class maiorFator {
    public static void main(String[] args) {
        long numero = 600851475143L;
        long maiorFatorPrimo = encontrarMaiorFatorPrimo(numero);
        System.out.println("O maior fator primo de " + numero + " é: " + maiorFatorPrimo);
    }

    public static long encontrarMaiorFatorPrimo(long numero) {
        long maiorFator = 1;
        for (long i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                maiorFator = i;
                numero /= i;
            }
        }
        return maiorFator;
    }
}

