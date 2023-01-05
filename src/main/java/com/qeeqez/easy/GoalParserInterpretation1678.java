package com.qeeqez.easy;

/**
 * 1678. Goal Parser Interpretation
 * <p>
 * You own a Goal Parser that can interpret a string command.
 * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
 * The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
 * The interpreted strings are then concatenated in the original order.
 * <p>
 * Given the string command, return the Goal Parser's interpretation of command.
 */
public class GoalParserInterpretation1678 {

    // Faster solution
    public String interpret(String command) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < command.length(); ) {
            char currentChar = command.charAt(i);
            if (currentChar == '(') {
                if (command.charAt(i + 1) == 'a') {
                    output.append("al");
                    i += 4;
                } else {
                    output.append("o");
                    i += 2;
                }
            } else {
                output.append(currentChar);
                i++;
            }
        }

        return output.toString();
    }

    // Straightforward solution
    public String interpretJavaStyle(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");

        return command;
    }
}

