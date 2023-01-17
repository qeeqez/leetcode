package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSmallestLetterFreaterThanTarget744Test {

    FindSmallestLetterFreaterThanTarget744 solution = new FindSmallestLetterFreaterThanTarget744();

    @Test
    public void testCase1() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char output = 'c';

        assertEquals(output, solution.nextGreatestLetter(letters, target));
    }

    @Test
    public void testCase2() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char output = 'f';

        assertEquals(output, solution.nextGreatestLetter(letters, target));
    }

    @Test
    public void testCase3() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';
        char output = 'f';

        assertEquals(output, solution.nextGreatestLetter(letters, target));
    }

    @Test
    public void testCase4() {
        char[] letters = {'c', 'f', 'j', 'k'};
        char target = 'a';
        char output = 'c';

        assertEquals(output, solution.nextGreatestLetter(letters, target));
    }

    @Test
    public void testCase5() {
        char[] letters = {'c', 'f', 'j', 'k'};
        char target = 'c';
        char output = 'f';

        assertEquals(output, solution.nextGreatestLetter(letters, target));
    }

    @Test
    public void testCase6() {
        char[] letters = {'c', 'f', 'j', 'k'};
        char target = 'i';
        char output = 'j';

        assertEquals(output, solution.nextGreatestLetter(letters, target));
    }

    @Test
    public void testCase7() {
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'z';
        char output = 'x';

        assertEquals(output, solution.nextGreatestLetter(letters, target));
    }
}
