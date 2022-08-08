package org.example.main;

import java.util.List;

public class FizzBuzzer {

    public String write(int number) {
        if (number % 3 ==0 && number %5 == 0 ) return "fizzbuzz";
        if(number % 5 == 0) return "buzz";
        if (number % 3 == 0 ) return "fizz";

        return String.valueOf(number);
    }
}
