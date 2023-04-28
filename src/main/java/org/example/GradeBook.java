package org.example;

public class GradeBook {
    private int exam1;
    private int exam2;
    private int exam3;

    public GradeBook(int e1, int e2, int e3) {
        exam1 = e1;
        exam2 = e2;
        exam3 = e3;
    }

    public double getAverage() {
        return (exam1 + exam2 + exam3) / 3.0;
    }
}
