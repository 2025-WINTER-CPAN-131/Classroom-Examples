package org.humber.week7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StringCompareToExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        BigDecimal bigDecimal = new BigDecimal("100.00");
        BigDecimal bigDecimal2 = new BigDecimal("100.00");
        bigDecimal2.compareTo(bigDecimal);

        names.add("John");
        names.add("Doe");
        names.add("Jane");
        names.add("Smith");

        System.out.println("List Before Sorting");
        for(String each : names) {
            System.out.println(each);
        }

        names.sort(String::compareToIgnoreCase);

        System.out.println("List After Sorting");
        for(String each : names) {
            System.out.println(each);
        }

        System.out.println("a - o: " + "a".compareTo("o"));

    }
}
