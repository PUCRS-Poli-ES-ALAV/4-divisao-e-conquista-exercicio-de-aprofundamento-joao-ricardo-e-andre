package br.pucrs;

public class Algo2 {

    public long maxVal(int []a, int n, int x) {
        x++;
        if (n == 0)
        {
           System.out.println(x);
            return a[n];
        }

        return Math.max(a[n-1], maxVal(a,n-1, x));
    }




}
