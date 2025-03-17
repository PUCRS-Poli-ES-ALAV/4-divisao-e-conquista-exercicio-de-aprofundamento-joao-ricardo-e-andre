package br.pucrs;

import java.sql.Array;
import java.util.Arrays;

public class Merge {
    //MERGE-SORT(L: List with n elements) : Ordered list with n elements
    //IF (list L has one element)
    //RETURN L.
    //Divide the list into two halves A and B.
    //A ← MERGE-SORT(A).
    //B ← MERGE-SORT(B).
    //L ← MERGE(A, B).
    //RETURN L.

    public int[] mergeSort(int[] list) {
        if (list.length == 1)
            return list;

        int[] left = Arrays.copyOfRange(list, 0, list.length / 2);
        int[] right = Arrays.copyOfRange(list, list.length / 2, list.length);

        return merge(mergeSort(left), mergeSort(right));
    }


    public int[] merge(int[] left, int[] right) {
        int[] list = new int[left.length + right.length];
        int listSize = 0;
        int k = 0;
        int i = 0;

        while (i < left.length && k < right.length) {
            if (left[i] < right[k]) {
                list[listSize++] = left[i++];
            } else {
                list[listSize++] = right[k++];
            }
        }

        while (i < left.length) {
            list[listSize++] = left[i++];
        }

        while (k < right.length) {
            list[listSize++] = right[k++];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return list;
    }
}