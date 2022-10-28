package com.epam.mjc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StringSize implements Function<List<String>, Map<String, Integer>> {
    @Override
    public Map<String, Integer> apply(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str,str.length());
        }
        return result;
    }

    @Override
    public <V> Function<V, Map<String, Integer>> compose(Function<? super V, ? extends List<String>> before) {
        return Function.super.compose(before);
    }

    @Override
    public <V> Function<List<String>, V> andThen(Function<? super Map<String, Integer>, ? extends V> after) {
        return Function.super.andThen(after);
    }
}
