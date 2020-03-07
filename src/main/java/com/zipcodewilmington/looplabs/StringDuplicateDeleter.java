package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] result = new String[0];
        String[] arr;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j<array.length;j++){
                if(array[i].equals(array[j])){
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] result = new String[0];
        String[] arr;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j<array.length;j++){
                if(array[i].equals(array[j])){
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
