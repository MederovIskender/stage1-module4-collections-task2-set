package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> result = new HashSet<>();

        Set<String> interSection = new HashSet<>(firstSet);
        interSection.retainAll(secondSet);
        interSection.removeAll(thirdSet);
        result.addAll(interSection);

        Set<String> exclusiveToThird = new HashSet<>(thirdSet);
        exclusiveToThird.removeAll(firstSet);
        exclusiveToThird.removeAll(secondSet);
        result.addAll(exclusiveToThird);

        return result;
    }
}
