package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AddEvenValuesAtTheEnd implements Consumer<List<Integer>> {
    List<Integer> evenValues;
    @Override
    public void accept(List<Integer> integers) {
        evenValues = new ArrayList<>();
        evenValues.addAll(integers);
        for (Integer num: integers) {
            if(num % 2 == 0) {
                evenValues.add(num);
            }
        }

    }

    @Override
    public Consumer<List<Integer>> andThen(Consumer<? super List<Integer>> after) {
        return (List<Integer> integers) -> { accept(evenValues); after.accept(integers); };
    }

    public AddEvenValuesAtTheEnd() {
        super();
    }
}
