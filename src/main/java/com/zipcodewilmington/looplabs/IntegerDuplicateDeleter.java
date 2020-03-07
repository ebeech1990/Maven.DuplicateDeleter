package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
//{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};    3
        Integer[] result = new Integer[0];
        Integer[] arr;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count < maxNumberOfDuplications){
                arr = Arrays.copyOf(result,result.length+1);
                arr[arr.length-1]=array[i];
                result = arr;
            }
            count=0;
        }
        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        //{0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9};    3
        Integer[] result = new Integer[0];
        Integer[] arr;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){

                arr = Arrays.copyOf(result,result.length+1);
                arr[arr.length-1]=array[i];
                System.out.println(arr[arr.length-1]);
                result = arr;
            }
            count=0;
        }
        return result;
    }

}
