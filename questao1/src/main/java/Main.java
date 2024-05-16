public class Main {
    public static void main(String[] args) {
        System.out.println("Progressão Aritmética:");
        ProgressaoAritmetica arit = new ProgressaoAritmetica(5, 2);
        for (int i = 0; i < 5; i++) {
            System.out.println(arit.proximo());
        }

        System.out.println("\nProgressão Geométrica:");
        ProgressaoGeometrica geo = new ProgressaoGeometrica(2, 3);
        for (int i = 0; i < 5; i++) {
            System.out.println(geo.proximo());
        }

        System.out.println("\nProgressão Fibonacci:");
        ProgressaoFibonacci fib = new ProgressaoFibonacci(0, 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(fib.proximo());
        }
    }
}