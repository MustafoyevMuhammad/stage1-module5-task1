package com.epam.mjc;

import java.util.List;
import java.util.function.Predicate;

public class IsValuesStartWithUpperCase implements Predicate<List<String>> {
    @Override
    public boolean test(List<String> strings) {
        boolean check = true;
        if(strings.isEmpty())
            return false;
        for (String str : strings) {
            if((str.substring(0,1)).charAt(0) < 65)
                return false;
            check = check && (str.substring(0,1).equals(str.toUpperCase().substring(0,1)));
        }
        return check;
    }


}
