package br.pucrs;

import java.util.Arrays;

public class Merge {
    private int iterations;

    public int[] mergeSort(int[] list) {
        iterations = 0;
        long startTime = System.nanoTime();
        int[] sortedList = mergeSortHelper(list);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Iteracoes: " + iterations);
        System.out.println("Tempo (ns): " + duration);

        return sortedList;
    }

    private int[] mergeSortHelper(int[] list) {
        if (list.length == 1) {
            return list;
        }

        int[] left = Arrays.copyOfRange(list, 0, list.length / 2);
        int[] right = Arrays.copyOfRange(list, list.length / 2, list.length);

        return merge(mergeSortHelper(left), mergeSortHelper(right));
    }

    private int[] merge(int[] left, int[] right) {
        int[] list = new int[left.length + right.length];
        int listSize = 0;
        int k = 0;
        int i = 0;

        while (i < left.length && k < right.length) {
            iterations++;
            if (left[i] < right[k]) {
                list[listSize++] = left[i++];
            } else {
                list[listSize++] = right[k++];
            }
        }

        while (i < left.length) {
            iterations++;
            list[listSize++] = left[i++];
        }

        while (k < right.length) {
            iterations++;
            list[listSize++] = right[k++];
        }

        return list;
    }
}