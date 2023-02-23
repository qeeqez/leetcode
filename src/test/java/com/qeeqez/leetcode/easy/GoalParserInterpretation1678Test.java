package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalParserInterpretation1678Test {

    GoalParserInterpretation1678 solution = new GoalParserInterpretation1678();

    @Test
    public void testCase1() {
        String command = "G()(al)";
        String output = "Goal";

        assertEquals(output, solution.interpretJavaStyle(command));
        assertEquals(output, solution.interpret(command));
    }

    @Test
    public void testCase2() {
        String command = "G()()()()(al)";
        String output = "Gooooal";

        assertEquals(output, solution.interpretJavaStyle(command));
        assertEquals(output, solution.interpret(command));
    }

    @Test
    public void testCase3() {
        String command = "(al)G(al)()()G";
        String output = "alGalooG";

        assertEquals(output, solution.interpretJavaStyle(command));
        assertEquals(output, solution.interpret(command));
    }
}
