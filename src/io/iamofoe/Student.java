package io.iamofoe;

import java.util.ArrayList;
import java.util.List;

final class Student {
    private final int id;
    private final List<Integer> grades;

    public Student(int id, List<Integer> grades) {
        this.id = id;
        this.grades = grades;
    }
    public int getId() {
        return this.id;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(this.grades);
    }
}
