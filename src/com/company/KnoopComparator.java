package com.company;

import java.util.Comparator;

public class KnoopComparator implements Comparator {
    @Override
    public int compare(Object a, Object b) {
        if (a == null || b == null) {
            throw new NullPointerException();
        }

        if (a instanceof Knoop && b instanceof Knoop) {
            Knoop knoopA = (Knoop) a;
            Knoop knoopB = (Knoop) b;

            return knoopA.getCount() - knoopB.getCount();
        } else {
            throw new IllegalArgumentException();
        }

    }
}
