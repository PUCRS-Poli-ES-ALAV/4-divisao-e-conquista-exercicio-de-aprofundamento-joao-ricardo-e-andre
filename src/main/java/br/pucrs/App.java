package br.pucrs;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Merge m = new Merge();

        int[] array = {1,5,3,4,7,6};
        //array = m.mergeSort(array);
        //System.out.println(Arrays.toString(array));


        Algo2 a = new Algo2();
        Algo3 b = new Algo3();

        //System.out.println(a.maxVal(array, 6, 0));
        System.out.println(b.maxValPrint(array, 0,5));
    }
}
