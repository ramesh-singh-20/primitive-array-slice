package com.alphacoder.array.util

import spock.lang.Specification

class ArraySlicerTest extends Specification{

    def 'Test ArraySlicer'(){
        given:
        def arr= new int[] {2,3,4,5,7,8,3,4,6}

        when:
        def result= ArraySlicer.sliceArray(arr, 3, 7)

        then:
        result.length== 4
        result[0]== 5
        result[1]==7
        result[2]==8
        result[3]==3
    }

}
