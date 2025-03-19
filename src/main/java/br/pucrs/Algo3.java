package br.pucrs;

import java.sql.Array;
import java.util.Arrays;

public class Algo3 {

    long maxVal2(int A[], int init, int end, int x) {
        x++;
        if (end - init <= 1){
            System.out.println(x);
            return Math.max(A[init], A[end]);
        }

        else {
            int m = (init + end) / 2;
            long v1 = maxVal2(A, init, m, x);
            long v2 = maxVal2(A, m + 1, end,x);
            return Math.max(v1, v2);
        }
    }


    long maxValPrint(int A[], int init, int end) {
        if (end - init <= 1){
            return 0;
        }

        else {
            int m = (init + end) / 2;
            long v1 = maxValPrint(A, init, m);
            long v2 = maxValPrint(A, m + 1, end);
            return v1 + v2 + 1;
        }
    }
}

//        123456
//    123       456
//12    3      45   6
//1 2          4   5