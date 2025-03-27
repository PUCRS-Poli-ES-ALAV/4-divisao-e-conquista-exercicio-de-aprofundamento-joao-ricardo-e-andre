package br.pucrs;

public class multiply {

    private int iterations;

    public double multiplyWithCount(double x, double y, double n) {
        iterations = 0;
        return multiply(x, y, n);
    }

    private double multiply(double x, double y, double n) {
        iterations++;
        double m, a, b, c, d, e, f, g, h;
        if (n == 1) {
            return x * y;
        } else {
            m = n / 2;
            a = x / Math.pow(2, m);
            b = x % Math.pow(2, m);
            c = y / Math.pow(2, m);
            d = y % Math.pow(2, m);
            e = multiply(a, c, m);
            f = multiply(b, d, m);
            g = multiply(b, c, m);
            h = multiply(a, d, m);
            return Math.pow(2, (2 * m)) * e + Math.pow(2, m) * (g + h) + f;
        }
    }


    public void multiplyAndPrint(double x, double y, double n) {
        long startTime = System.nanoTime();
        double result = multiplyWithCount(x, y, n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        //System.out.println("Result: " + result);
        System.out.println("Iteracoes: " + iterations);
        System.out.println("Tempo (ns): " + duration);
    }
}