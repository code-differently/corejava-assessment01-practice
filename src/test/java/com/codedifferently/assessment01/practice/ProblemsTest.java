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

    @Test
    public void diff21Test03(){
        //Given
        Problems problems = new Problems();
        Integer input = 22;

        //When
        Integer expected = 2;
        Integer actual = problems.diff21(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void diff21Test04(){
        //Given
        Problems problems = new Problems();
        Integer input = 25;

        //When
        Integer expected = 8;
        Integer actual = problems.diff21(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void diff21Test05(){
        //Given
        Problems problems = new Problems();
        Integer input = 21;

        //When
        Integer expected = 0;
        Integer actual = problems.diff21(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void backAroundTest01(){
        //Given
        Problems problems = new Problems();
        String input = "cat";

        //When
        String expected = "tcatt";
        String actual = problems.backAround(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void backAroundTest02(){
        //Given
        Problems problems = new Problems();
        String input = "Hello";

        //When
        String expected = "oHelloo";
        String actual = problems.backAround(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void backAroundTest03(){
        //Given
        Problems problems = new Problems();
        String input = "a";

        //When
        String expected = "aaa";
        String actual = problems.backAround(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void backAroundTest04(){
        //Given
        Problems problems = new Problems();
        String input = "abc";

        //When
        String expected = "cabcc";
        String actual = problems.backAround(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void backAroundTest05(){
        //Given
        Problems problems = new Problems();
        String input = "read";

        //When
        String expected = "dreadd";
        String actual = problems.backAround(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void mixStartTest01(){
        //Given
        Problems problems = new Problems();
        String input = "mix snacks";

        //When
        Boolean expected = true;
        Boolean actual = problems.mixStart(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void mixStartTest02(){
        //Given
        Problems problems = new Problems();
        String input = "pix snacks";

        //When
        Boolean expected = true;
        Boolean actual = problems.mixStart(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void mixStartTest03(){
        //Given
        Problems problems = new Problems();
        String input = "piz snacks";

        //When
        Boolean expected = false;
        Boolean actual = problems.mixStart(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void mixStartTest04(){
        //Given
        Problems problems = new Problems();
        String input = "nix snacks";

        //When
        Boolean expected = true;
        Boolean actual = problems.mixStart(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void mixStartTest05(){
        //Given
        Problems problems = new Problems();
        String input = "ni snacks";

        //When
        Boolean expected = false;
        Boolean actual = problems.mixStart(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stringETest01(){
        //Given
        Problems problems = new Problems();
        String input = "Hello";

        //When
        Boolean expected = true;
        Boolean actual = problems.stringE(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stringETest02(){
        //Given
        Problems problems = new Problems();
        String input = "Heelle";

        //When
        Boolean expected = true;
        Boolean actual = problems.stringE(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stringETest03(){
        //Given
        Problems problems = new Problems();
        String input = "Heelele";

        //When
        Boolean expected = false;
        Boolean actual = problems.stringE(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stringETest04(){
        //Given
        Problems problems = new Problems();
        String input = "HII";

        //When
        Boolean expected = false;
        Boolean actual = problems.stringE(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stringETest05(){
        //Given
        Problems problems = new Problems();
        String input = "e";

        //When
        Boolean expected = true;
        Boolean actual = problems.stringE(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void frontBackTest01(){
        //Given
        Problems problems = new Problems();
        String input = "code";

        //When
        String expected = "eodc";
        String actual = problems.frontBack(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void frontBackTest02(){
        //Given
        Problems problems = new Problems();
        String input = "a";

        //When
        String expected = "a";
        String actual = problems.frontBack(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void frontBackTest03(){
        //Given
        Problems problems = new Problems();
        String input = "ab";

        //When
        String expected = "ba";
        String actual = problems.frontBack(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void frontBackTest04(){
        //Given
        Problems problems = new Problems();
        String input = "abc";

        //When
        String expected = "cba";
        String actual = problems.frontBack(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void frontBackTest05(){
        //Given
        Problems problems = new Problems();
        String input = "Chocolate";

        //When
        String expected = "ehocolatC";
        String actual = problems.frontBack(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void or35Test01(){
        //Given
        Problems problems = new Problems();
        Integer input = 3;

        //When
        Boolean expected = true;
        Boolean actual = problems.or35(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void or35Test02(){
        //Given
        Problems problems = new Problems();
        Integer input = 10;

        //When
        Boolean expected = true;
        Boolean actual = problems.or35(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void or35Test03(){
        //Given
        Problems problems = new Problems();
        Integer input = 8;

        //When
        Boolean expected = false;
        Boolean actual = problems.or35(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void or35Test04(){
        //Given
        Problems problems = new Problems();
        Integer input = 15;

        //When
        Boolean expected = true;
        Boolean actual = problems.or35(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void or35Test05(){
        //Given
        Problems problems = new Problems();
        Integer input = 5;

        //When
        Boolean expected = true;
        Boolean actual = problems.or35(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void startOzTest01(){
        //Given
        Problems problems = new Problems();
        String input = "ozymandias";

        //When
        String expected = "oz";
        String actual = problems.startOz(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void startOzTest02(){
        //Given
        Problems problems = new Problems();
        String input = "bzoo";

        //When
        String expected = "z";
        String actual = problems.startOz(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void startOzTest03(){
        //Given
        Problems problems = new Problems();
        String input = "oxx";

        //When
        String expected = "o";
        String actual = problems.startOz(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void startOzTest04(){
        //Given
        Problems problems = new Problems();
        String input = "oz";

        //When
        String expected = "oz";
        String actual = problems.startOz(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void startOzTest05(){
        //Given
        Problems problems = new Problems();
        String input = "ounce";

        //When
        String expected = "o";
        String actual = problems.startOz(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void notStringTest01(){
        //Given
        Problems problems = new Problems();
        String input = "candy";

        //When
        String expected = "not candy";
        String actual = problems.notString(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void notStringTest02(){
        //Given
        Problems problems = new Problems();
        String input = "x";

        //When
        String expected = "not x";
        String actual = problems.notString(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void notStringTest03(){
        //Given
        Problems problems = new Problems();
        String input = "not bad";

        //When
        String expected = "not bad";
        String actual = problems.notString(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void notStringTest04(){
        //Given
        Problems problems = new Problems();
        String input = "bad";

        //When
        String expected = "not bad";
        String actual = problems.notString(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void notStringTest05(){
        //Given
        Problems problems = new Problems();
        String input = "not";

        //When
        String expected = "not";
        String actual = problems.notString(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front3Test01(){
        //Given
        Problems problems = new Problems();
        String input = "Java";

        //When
        String expected = "JavJavJav";
        String actual = problems.front3(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front3Test02(){
        //Given
        Problems problems = new Problems();
        String input = "Chocolate";

        //When
        String expected = "ChoChoCho";
        String actual = problems.front3(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front3Test03(){
        //Given
        Problems problems = new Problems();
        String input = "abc";

        //When
        String expected = "abcabcabc";
        String actual = problems.front3(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front3Test04(){
        //Given
        Problems problems = new Problems();
        String input = "abcXYZ";

        //When
        String expected = "abcabcabc";
        String actual = problems.front3(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front3Test05(){
        //Given
        Problems problems = new Problems();
        String input = "ab";

        //When
        String expected = "ababab";
        String actual = problems.front3(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front22Test01(){
        //Given
        Problems problems = new Problems();
        String input = "kitten";

        //When
        String expected = "kikittenki";
        String actual = problems.front22(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front22Test02(){
        //Given
        Problems problems = new Problems();
        String input = "Ha";

        //When
        String expected = "HaHaHa";
        String actual = problems.front22(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front22Test03(){
        //Given
        Problems problems = new Problems();
        String input = "abc";

        //When
        String expected = "ababcab";
        String actual = problems.front22(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void front22Test04(){
        //Given
        Problems problems = new Problems();
        String input = "ab";

        //When
        String expected = "ababab";
        String actual = problems.front22(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void front22Test05(){
        //Given
        Problems problems = new Problems();
        String input = "a";

        //When
        String expected = "aaa";
        String actual = problems.front22(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void delDelTest01(){
        //Given
        Problems problems = new Problems();
        String input = "adelbc";

        //When
        String expected = "abc";
        String actual = problems.delDel(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void delDelTest02(){
        //Given
        Problems problems = new Problems();
        String input = "adelHello";

        //When
        String expected = "aHello";
        String actual = problems.delDel(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void delDelTest03(){
        //Given
        Problems problems = new Problems();
        String input = "adedbc";

        //When
        String expected = "adedbc";
        String actual = problems.delDel(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void delDelTest04(){
        //Given
        Problems problems = new Problems();
        String input = "abcdel";

        //When
        String expected = "abcdel";
        String actual = problems.delDel(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void delDelTest05(){
        //Given
        Problems problems = new Problems();
        String input = "add";

        //When
        String expected = "add";
        String actual = problems.delDel(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void endUpTest01(){
        //Given
        Problems problems = new Problems();
        String input = "Hello";

        //When
        String expected = "HeLLO";
        String actual = problems.endUp(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void endUpTest02(){
        //Given
        Problems problems = new Problems();
        String input = "hi there";

        //When
        String expected = "hi thERE";
        String actual = problems.endUp(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void endUpTest03(){
        //Given
        Problems problems = new Problems();
        String input = "hi";

        //When
        String expected = "HI";
        String actual = problems.endUp(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void endUpTest04(){
        //Given
        Problems problems = new Problems();
        String input = "woo hoo";

        //When
        String expected = "woo HOO";
        String actual = problems.endUp(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void endUpTest05(){
        //Given
        Problems problems = new Problems();
        String input = "xyz12";

        //When
        String expected = "xyZ12";
        String actual = problems.endUp(input);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10Test01(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = problems.makes10(9,10);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10Test02(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = false;
        Boolean actual = problems.makes10(9,9);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10Test03(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = problems.makes10(1,9);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10Test04(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = problems.makes10(10,1);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void makes10Test05(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = problems.makes10(10,10);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest01(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = problems.posNeg(1,-1,false);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest02(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = problems.posNeg(-1,1,false);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest03(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = problems.posNeg(-4,-5,true);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest04(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = false;
        Boolean actual = problems.posNeg(-4,-5,false);

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void posNegTest05(){
        //Given
        Problems problems = new Problems();

        //When
        Boolean expected = true;
        Boolean actual = problems.posNeg(-4,5,false);

        //Then
        Assertions.assertEquals(expected,actual);
    }

}