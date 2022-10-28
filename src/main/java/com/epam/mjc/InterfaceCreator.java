package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return new IsValuesStartWithUpperCase();
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return new AddEvenValuesAtTheEnd();
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return new FilterCollection(values);
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return new StringSize();
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return new ConcatList();
    }
}
