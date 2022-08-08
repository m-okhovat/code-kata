package org.example.main;

public class Fibonacci {
    public int number(int position) {
        if (position == 0) return 0;
        if(position == 1 ) return 1;

        return number(position -1) + number(position -2);
    }
}
