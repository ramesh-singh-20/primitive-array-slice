package com.alphacoder.array.util;

import java.util.Arrays;

public class ArraySlicer {
    private ArraySlicer(){

    }

    public static int[] sliceArray(int[] arr, int startIndex, int lastIndex){
        int [] slice= Arrays.copyOfRange(arr, startIndex, lastIndex);

        return slice;
    }
}
