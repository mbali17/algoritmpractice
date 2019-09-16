package com.ali.algortihms.test;

import com.ali.algortihms.linearSearch.LinearSearch;


public  class TestLinearSearch {
    public static void main(String[] args) {
        LinearSearch<Integer> linearSearch = new LinearSearch<>();
        Integer []elementsToSearch = {1,2,5,8,9,22,44,10};
        Integer element = linearSearch.search(elementsToSearch, 10);
        System.out.println( element!= null?element:"search did not find the value.");
    }
}

