package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer>squareSet = new TreeSet<>();
        for (Integer number: sourceList){
            int square = number * number;
            squareSet.add(square);
        }

        NavigableSet<Integer>subset = squareSet.subSet(lowerBound,true,upperBound,true);
        return subset;
    }
}
