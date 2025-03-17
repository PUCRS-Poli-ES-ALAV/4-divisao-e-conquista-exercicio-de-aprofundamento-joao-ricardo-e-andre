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
        array = m.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
