package com.ooftf.algorithm.sort;

class QuickSort {
    // 从一侧遍历找
    public static int Parition(int[] array, int left, int right) {
        int pivot = array[left];
        int index = right;
        int temp;
        for (int j = right; j > left; j--) {
            if (array[j] > pivot) {/** N o w J a v a . c o m 提供 **/
                System.err.println(""+j+"-"+index);
                temp = array[j];
                array[j] = array[index];
                array[index] = temp;
                index--;
            }
        }
        array[left] = array[index];
        array[index] = pivot;
        return index;
    }  // Divide array into halves

    public static void Quick(int[] array, int left, int right) {
        if (left < right) {
            int pivot = Parition(array, left, right);
            Quick(array, left, pivot - 1);
            Quick(array, pivot + 1, right);
        }
    }

    public static void quickSort(int array[], int size) {
        Quick(array, 0, size - 1);
    }  // function ro print array

    public static void Print_Array(int[] array, int size) {
        for (int i = 0; i < size; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(array, 10);
        Print_Array(array, 10);
    }

}
