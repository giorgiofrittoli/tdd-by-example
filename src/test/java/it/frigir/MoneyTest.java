package it.frigir;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.getAmount());
        five.times(3);
        assertEquals(15,five.getAmount());
    }

}