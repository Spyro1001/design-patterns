package com.designpatterns.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListAdapter
    implements Sorter {
    @Override
    public int[] sort(int[] numbers) {

        // convert the array to a List
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        // call the adaptee
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);

        //convert the list back to an array and return
        int[] sortedNumbers = numberList.stream().mapToInt(Integer::intValue).toArray();
        return sortedNumbers;
    }
}
