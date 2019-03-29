package com.atfortechdynamics.justaapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FirstTest {

    @Test
    public void add(){
        assertEquals(8,addNumbers(5,3));
    }

    public int addNumbers(int a ,int b){
        return a+b;
    }

    @Test
    public void checkRunnerArray(){
        assertEquals(4,new Runners().runner[4]);
    }
}
