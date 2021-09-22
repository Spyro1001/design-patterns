package com.designpatterns.adapter;

import java.util.Collections;
import java.util.List;

/**
 * This is our adaptee class.  It's representative of a third party implementation of a number
 * sorter that deals with Lists, not arrays.
 */
public class NumberSorter {

    public List<Integer> sort(List<Integer> numbers) {

        Collections.sort(numbers);
        return numbers;
    }

}
