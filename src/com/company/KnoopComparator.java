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

            if (knoopA.getCount() < knoopB.getCount()) {
                return -1;
            }
            if (knoopA.getCount() == knoopB.getCount()) {
                return 0;
            }
            if (knoopA.getCount() > knoopB.getCount()) {
                return 1;
            }
            return 0;

        } else {
            throw new IllegalArgumentException();
        }

    }
}
