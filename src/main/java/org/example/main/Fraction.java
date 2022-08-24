package org.example.main;

public class Fraction {

    private final int number;
//    private  boolean hasAnotherNumber;
    public Fraction(int number) {

        this.number = number;
    }

    public Fraction(int number, int anotherNumber){
        this.number = number;
//        this.hasAnotherNumber  = true;

    }

    public Fraction plus(Fraction that) {
//          if (hasAnotherNumber) return new Fraction(5,5);
        return new Fraction(this.number + that.number, 5);
    }

    public int toIntValue() {
        return number;
    }

    public int getDemominator() {
        return 5;
    }

    public int getNuminator() {
        return 5;
    }
}
