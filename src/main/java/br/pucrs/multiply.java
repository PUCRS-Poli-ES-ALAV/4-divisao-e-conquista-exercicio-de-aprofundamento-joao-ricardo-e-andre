package br.pucrs;

public class multiply {
    public double MULTIPLY(double x, double y, double n) {
       double m,a,b,c,d,e,f,g,h;
        if(n == 1)
        return x * y;


        else{
            m = n / 2;
            a = x / Math.pow(2, m);
            b = x % Math.pow(2,m);
            c = y / Math.pow(2,m) ;
            d = y % Math.pow(2,m);
            e = MULTIPLY(a, c, m);
            f = MULTIPLY(a, c, m);
            g = MULTIPLY(a, c, m);
            h = MULTIPLY(a, c, m);
            return Math.pow(2, (2 * m)) * e + Math.pow(2,m) * (g + h) + f;
        }
    }
}
