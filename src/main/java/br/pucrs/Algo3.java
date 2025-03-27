package br.pucrs;

public class Algo3 {
    private int iterations;

    public long maxVal2(int[] A, int init, int end) {
        iterations = 0;
        long startTime = System.nanoTime();
        long result = maxVal2Helper(A, init, end);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Iteracoes: " + iterations);
        System.out.println("Tempo (ns): " + duration);

        return result;
    }

    private long maxVal2Helper(int[] A, int init, int end) {
        iterations++;
        if (end - init <= 1) {
            return Math.max(A[init], A[end]);
        } else {
            int m = (init + end) / 2;
            long v1 = maxVal2Helper(A, init, m);
            long v2 = maxVal2Helper(A, m + 1, end);
            return Math.max(v1, v2);
        }
    }

    public long maxValPrint(int[] A, int init, int end) {
        if (end - init <= 1) {
            return 0;
        } else {
            int m = (init + end) / 2;
            long v1 = maxValPrint(A, init, m);
            long v2 = maxValPrint(A, m + 1, end);
            return v1 + v2 + 1;
        }
    }
}