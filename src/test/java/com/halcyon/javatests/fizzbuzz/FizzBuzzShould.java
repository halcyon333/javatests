package com.halcyon.javatests.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzShould {

    @Test
    public void number_is_divisible_by_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));

    }

    @Test
    public void number_is_divisible_by_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));

    }

    @Test
    public void number_is_divisible_by_3_and_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz"));

    }

    @Test
    public void number_is_not_divisible_by_3_or_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
        assertThat(FizzBuzz.fizzBuzz(16), is("16"));

    }
    //cambios
}