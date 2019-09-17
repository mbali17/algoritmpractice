package com.ali.algortihms.linearSearch;

public class LinearSearch <T> {
    public T search(T[] elementsToSearch,T value){
        int arrayLength = elementsToSearch.length;
        for (int i=0;i<arrayLength;i++){
            if(elementsToSearch[i].equals(value)){
                return elementsToSearch[i];
            }
        }
        return null;
    }


}
