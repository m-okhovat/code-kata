package org.example.main;

public class Fraction {

    private int number;

    public Fraction(int number) {

        this.number = number;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.number + that.number);
    }

    public int toIntValue() {
        return number;
    }
}
