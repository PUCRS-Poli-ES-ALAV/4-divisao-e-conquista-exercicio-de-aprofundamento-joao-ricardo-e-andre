package br.pucrs;

public class Algo2 {
    private long iterations;

    public long maxVal(int[] a, int n) {
        iterations = 0;
        long startTime = System.nanoTime();
        long result = maxValHelper(a, n);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Iteracoes: " + iterations);
        System.out.println("Tempo (ns): " + duration);

        return result;
    }

    private long maxValHelper(int[] a, int n) {
        iterations++;
        if (n == 0) {
            return a[n];
        }
        return Math.max(a[n - 1], maxValHelper(a, n - 1));
    }
}