package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class ConcatList implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {
    @Override
    public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
        List<Integer> result = new ArrayList<>();
        result.addAll(integers);
        result.addAll(integers2);
        return result;
    }
}
