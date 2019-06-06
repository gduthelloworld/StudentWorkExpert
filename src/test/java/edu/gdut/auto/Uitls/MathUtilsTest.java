package edu.gdut.auto.Uitls;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {
    @Test
    public void test1(){
        System.out.println(MathUtils.isNumeric("s"));
        System.out.println(MathUtils.isNumeric("596"));

    }
}