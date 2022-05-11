package com.company;

public class InitArray {

    public static void main(String[] args){
        final int ARRAY_LENGTH = 10;
        int[] array = new int [ARRAY_LENGTH];

        for (int i=0; i<ARRAY_LENGTH; i++){
            array[i] = 2*i+2;
        }



    }

    static int[] modifyArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i] *5;
        }
        return arr;
    }
}
