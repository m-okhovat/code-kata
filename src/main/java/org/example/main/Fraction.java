package org.example.main;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int number) {

        this.numerator = number;
        this.denominator = 1;
    }

    public Fraction(int number, int denominator) {
        this.numerator = number;
        this.denominator = denominator;

    }

    public Fraction plus(Fraction that) {
        if (this.denominator!=that.denominator){
         return new Fraction(this.numerator* that.denominator + that.numerator*this.denominator,
                 this.denominator* that.denominator);
        }
        else {
            return new Fraction(this.numerator + that.numerator, denominator);
        }
    }

    public int toIntValue() {
        return numerator;
    }

    public int getDenominator() {

        return denominator;
    }

    public int getNumerator() {

        return numerator;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;

        if (other instanceof  Fraction) {

            var that = (Fraction)other;
            return (that.denominator == this.denominator && that.numerator == this.numerator);
        }
        return false;
    }


}
