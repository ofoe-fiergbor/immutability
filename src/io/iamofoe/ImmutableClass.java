package io.iamofoe;

import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
    private final int x;
    private final List<Integer> grades;

    public ImmutableClass(int x, List<Integer> grades) {
        this.x = x;
        this.grades = grades;
    }
    public int getX() {
        return this.x;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(this.grades);
    }
}
