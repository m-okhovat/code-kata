package org.example.main;

public class Fraction {

    private final int number;
    private final int denominator;

    public Fraction(int number) {

        this.number = number;
        this.denominator = 1;
    }

    public Fraction(int number, int denominator) {
        this.number = number;
        this.denominator = denominator;

    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.number + that.number, denominator);
    }

    public int toIntValue() {
        return number;
    }

    public int getDenominator() {

        return denominator;
    }

    public int getNumerator() {

        return number;
    }
}
