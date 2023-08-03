public class fibonacci {
    public static void main(String[] args) {
        int limit = 4000000;
        long sum = 0;

        int prevTerm = 1;
        int currentTerm = 2;

        while (currentTerm <= limit) {
            if (currentTerm % 2 == 0) {
                sum += currentTerm;
            }

            int nextTerm = prevTerm + currentTerm;
            prevTerm = currentTerm;
            currentTerm = nextTerm;
        }

        System.out.println("A soma dos termos pares da sequência de Fibonacci até 4 milhões é: " + sum);
    }
}
