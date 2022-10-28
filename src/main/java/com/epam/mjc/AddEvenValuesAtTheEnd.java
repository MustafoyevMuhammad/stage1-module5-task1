package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AddEvenValuesAtTheEnd implements Consumer<List<Integer>> {
    List<Integer> evenValues;
    @Override
    public void accept(List<Integer> integers) {
        List<Integer> list = new ArrayList<>();
        for (Integer num: integers) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        integers.addAll(list);

    }
}
