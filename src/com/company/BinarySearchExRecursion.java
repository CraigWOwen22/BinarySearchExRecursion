package com.company;

public class BinarySearchExRecursion {

    public static int binarySearchExRecursion(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while(high >= low){
            int middle = (low + high) / 2;
            if(array[middle] == target){
                return middle;
            }
            else if(array[middle] < target){
                low = middle + 1;
            }
            else if(array[middle] > target){
                high = middle - 1;
            }

        }

        return -1;
    }
}
