package com.codedifferently.assessment01.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemsTest {

    @Test
    public void diff21Test01(){
        //Given
        Problems problems = new Problems();
        Integer input = 19;

        //When
        Integer expected = 2;
        Integer actual = problems.diff21(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void diff21Test02(){
        //Given
        Problems problems = new Problems();
        Integer input = 10;

        //When
        Integer expected = 11;
        Integer actual = problems.diff21(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }
}
