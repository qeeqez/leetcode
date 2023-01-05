package com.qeeqez.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2194. Cells in a Range on an Excel Sheet
 * <p>
 * A cell (r, c) of an excel sheet is represented as a string "<col><row>" where:
 * <p>
 * * <col> denotes the column number c of the cell. It is represented by alphabetical letters.
 * * * For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
 * * <row> is the row number r of the cell. The rth row is represented by the integer r.
 * You are given a string s in the format "<col1><row1>:<col2><row2>",
 * where <col1> represents the column c1, <row1> represents the row r1,
 * <col2> represents the column c2, and <row2> represents the row r2,
 * such that r1 <= r2 and c1 <= c2.
 * <p>
 * Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2.
 * The cells should be represented as strings in the format mentioned above
 * and be sorted in non-decreasing order first by columns and then by rows.
 */
public class CellsRangeExcel2194 {

    // Faster solution
    public List<String> cellsInRange(String s) {
        char[] charArray = s.toCharArray();
        int letter1 = charArray[0];
        int number1 = Character.getNumericValue(charArray[1]);
        int letter2 = charArray[3];
        int number2 = Character.getNumericValue(charArray[4]);
        List<String> output = new ArrayList<>();

        for (int i = letter1; i < letter2 + 1; i++) {
            for (int j = number1; j < number2 + 1; j++) {
                @SuppressWarnings({"StringBufferReplaceableByString", "StringBufferMayBeStringBuilder"})
                StringBuffer sb = new StringBuffer();

                sb.append((char) i);
                sb.append(j);

                output.add(sb.toString());
            }
        }
        return output;
    }

    // Straightforward solution
    public List<String> cellsInRangeSlow(String s) {
        int letter1 = s.charAt(0);
        int number1 = Character.getNumericValue(s.charAt(1));
        int letter2 = s.charAt(3);
        int number2 = Character.getNumericValue(s.charAt(4));
        List<String> output = new ArrayList<>();

        for (int i = letter1; i < letter2 + 1; i++) {
            String letter = String.valueOf((char) i);
            for (int j = number1; j < number2 + 1; j++) {
                output.add(letter + j);
            }
        }
        return output;
    }

}

