package academy.learnprogramming.sort;

import sort.type.MergeSort;

public class Main {

    public static void main(String[] args) {

/*      bubbleSort();
        System.out.println("Finished bubble sort\n" );

        SelectionSort.selectionSort();
        System.out.println("Finished selection sort\n");*/

        //InsertionSort.insertionSort();
        //System.out.println("Finished Insertion sort\n")

        //ShellSort.shellSort();
        //System.out.println("Finished Shell sort\n");

        //System.out.println(Recursion.iterativeFactorial(3)+"\n");

        //System.out.println(Recursion.recursiveFactorial(3)+"\n");

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        MergeSort.mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        System.out.println("Finished Merge Sort");



    }
}
