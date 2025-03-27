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
        //32, 2048 e 1.048.576
        gerador ge = new gerador();
        int[] generatedArray32 = ge.geraVetor(16, 16);
        int[] generatedArray2048 = ge.geraVetor(1024, 1024);
        int[] generatedArray1000 = ge.geraVetor(524288, 524288);
        //System.out.println(Arrays.toString(generatedArray));

        System.out.println("--------Merge-------");
        Merge m = new Merge();
        System.out.println("   ----32---   ");
        m.mergeSort(generatedArray32);
        System.out.println("   ----2048---   ");
        m.mergeSort(generatedArray2048);
        System.out.println("   ----1.048.576---   ");
        m.mergeSort(generatedArray1000);
        //System.out.println(Arrays.toString(array));

        System.out.println("");

        System.out.println("--------MaxVal1-------");
        Algo2 a = new Algo2();
        System.out.println("      ----32---   ");
        a.maxVal(generatedArray32, 32);
        System.out.println("      ----2048---   ");
        a.maxVal(generatedArray2048, 2048);
        System.out.println("      ----1.048.576---   ");
        //System.out.println(generatedArray1000.length);
        //a.maxVal(generatedArray1000, 1048567);
        System.out.println("StackOverflow");

        System.out.println("");

        System.out.println("--------MaxVal2-------");
        Algo3 b = new Algo3();
        System.out.println("      ----32---   ");
        b.maxVal2(generatedArray32, 0,31);
        System.out.println("      ----2048---   ");
        b.maxVal2(generatedArray2048, 0,2047);
        System.out.println("      ----1.048.576---   ");
        b.maxVal2(generatedArray1000, 0,1048575);

        System.out.println("");

        System.out.println("--------Multiply-------");
        multiply mult = new multiply();


        mult.multiplyAndPrint(15, 15, 4); //4

        mult.multiplyAndPrint(65535, 65535, 16); // 16

        mult.multiplyAndPrint(9223372036854775807L, 9223372036854775807L, 64); // 64 bits



        //System.out.println("a");

        //karatsuba kab = new karatsuba();

        //System.out.println(kab.tsuba("1000", "0010"));
    }
}
