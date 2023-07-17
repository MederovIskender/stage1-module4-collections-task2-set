package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> sortedSet = new HashSet<>();
        for (int number: sourceList){
            if (number % 2 == 0){
                int current = number;
                while (current % 2 == 0){
                    sortedSet.add(current);
                    current /=2;
                }
                sortedSet.add(current);
            } else {
                sortedSet.add(number);
                sortedSet.add(2 * number);
            }
        }
        return sortedSet;
    }

}

