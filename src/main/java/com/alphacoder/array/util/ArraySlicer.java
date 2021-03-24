package com.alphacoder.array.util;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySlicer {
    private ArraySlicer(){

    }

    public static int[] sliceArray(int[] arr, int startIndex, int lastIndex){
        return Arrays.copyOfRange(arr, startIndex, lastIndex);
    }

    public static int[] sliceArrayUsingStream(int [] arr, int startIndex, int lastIndex){
        return IntStream.range(startIndex, lastIndex).map(i-> arr[i]).toArray();
    }
}
