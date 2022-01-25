package com.codedifferently.assessment01.practice;

public class Problems {

    /**
     * Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21.
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     */
    public Integer diff21(int n) {
        return null;
    }


    /**
     * Given a string, take the last char and return a new string with
     * the last char added at the front and back, so "cat" yields "tcatt".
     * The original string will be length 1 or more.
     * backAround("cat") → "tcatt"
     * backAround("Hello") → "oHelloo"
     * backAround("a") → "aaa"
     */
    public String backAround(String str) {
        return null;
    }

    /**
     * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix",
     * "9ix" .. all count.
     * mixStart("mix snacks") → true
     * mixStart("pix snacks") → true
     * mixStart("piz snacks") → false
     */
    public boolean mixStart(String str) {
        return false;
    }

    /**
     * Return true if the given string contains between 1 and 3 'e' characters.
     * stringE("Hello") → true
     * stringE("Heelle") → true
     * stringE("Heelele") → false
     */
    public boolean stringE(String str) {
        return false;
    }


    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     * frontBack("code") → "eodc"
     * frontBack("a") → "a"
     * frontBack("ab") → "ba"
     */
    public String frontBack(String str) {
        return null;
    }


    /**
     * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the
     * % "mod" operator.
     * or35(3) → true
     * or35(10) → true
     * or35(8) → false
     */
    public boolean or35(Integer n) {
        return false;
    }

    /**
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if it is 'z',
     * so "ozymandias" yields "oz".
     * startOz("ozymandias") → "oz"
     * startOz("bzoo") → "z"
     * startOz("oxx") → "o"
     */
    public String startOz(String str) {
        return null;
    }

    /**
     *
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.
     * notString("candy") → "not candy"
     * notString("x") → "not x"
     * notString("not bad") → "not bad"
     */
    public String notString(String str) {
        return null;
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there.
     * Return a new string which is 3 copies of the front.
     * front3("Java") → "JavJavJav"
     * front3("Chocolate") → "ChoChoCho"
     * front3("abc") → "abcabcabc"
     */

    public String front3(String str) {
        return null;
    }

    /**
     * Given a string, take the first 2 chars and return the string with the 2 chars added
     * at both the front and back, so "kitten" yields"kikittenki".
     * If the string length is less than 2, use whatever chars are there.
     * front22("kitten") → "kikittenki"
     * front22("Ha") → "HaHaHa"
     * front22("abc") → "ababcab"
     */

    public String front22(String str) {
        return null;
    }

    /**
     * Given a string, if the string "del" appears starting at index 1,
     * return a string where that "del" has been deleted.
     * Otherwise, return the string unchanged.
     * delDel("adelbc") → "abc"
     * delDel("adelHello") → "aHello"
     * delDel("adedbc") → "adedbc"
     */

    public String delDel(String str) {
        return null;
    }

    /**
     * Given a string, return a new string where the last 3 chars are now in upper case.
     * If the string has less than 3 chars, uppercase whatever is there.
     * Note that str.toUpperCase() returns the uppercase version of a string.
     * endUp("Hello") → "HeLLO"
     * endUp("hi there") → "hi thERE"
     * endUp("hi") → "HI"
     */

    public String endUp(String str) {
        return null;
    }

    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     * makes10(9, 10) → true
     * makes10(9, 9) → false
     * makes10(1, 9) → true
     */

    public boolean makes10(int a, int b) {
        return false;
    }


    /**
     *
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are negative.
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     */

    public boolean posNeg(int a, int b, boolean negative) {
        return false;
    }
}