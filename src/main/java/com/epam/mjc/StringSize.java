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

}
