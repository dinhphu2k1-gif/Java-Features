package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollections {
    List<Integer> someIntList = new ArrayList<>();
    @Test(expected = UnsupportedOperationException.class)
    public void whenModifyCopyOfList_thenThrowsException() {
        List<Integer> copyList = List.copyOf(someIntList);
        copyList.add(4);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenModifyToUnmodifiableList_thenThrowsException() {
        List<Integer> evenList = someIntList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        evenList.add(4);
    }
}
