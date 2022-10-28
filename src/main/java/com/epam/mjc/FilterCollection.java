package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FilterCollection implements Supplier<List<String>> {
    List<String> values;
    public FilterCollection(List<String> values){
        this.values = values;
    }
    @Override
    public List<String> get() {
        List<String> result = new ArrayList<>();
        for (String str : values) {
            String[] temp = str.split(" ");
            if(Character.isUpperCase(temp[0].charAt(0)) && temp.length > 3 &&
                    temp[temp.length - 1].endsWith(".")){
                result.add(str);
            }
        }
        return result;
    }
}
