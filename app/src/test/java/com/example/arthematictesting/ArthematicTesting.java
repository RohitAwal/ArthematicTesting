package com.example.arthematictesting;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArthematicTesting {
    @Test
    public void AddArthematic(){
        Arthematic arthematic = new Arthematic();
        float expectedresult = 25;
        float actualresult = arthematic.add(10, 15);
        assertEquals(expectedresult,actualresult);
    }

    @Test
    public void SubstractArthematic(){
        Arthematic arthematic = new Arthematic();
        float expectedresult = 5;
        float actualresult = arthematic.substract(15, 10);
        assertEquals(expectedresult,actualresult);
    }

    @Test
    public void DivideArthematic(){
        Arthematic arthematic = new Arthematic();
        float expectedresult = 3;
        float actualresult = arthematic.divide(15, 5);
        assertEquals(expectedresult,actualresult);
    }
}
