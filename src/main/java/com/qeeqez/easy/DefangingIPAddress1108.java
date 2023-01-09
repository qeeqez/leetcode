package com.qeeqez.easy;

/**
 * 1108. Defanging an IP Address
 * <p>
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]"
 */
public class DefangingIPAddress1108 {

    // Fast solution
    public String defangIPaddr(String address) {
        int n = address.length();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char currentChar = address.charAt(i);
            if (currentChar == '.') {
                output.append("[.]");
            } else {
                output.append(currentChar);
            }
        }
        return output.toString();
    }

    // Java Naive solution
    public String defangIPaddrNaive(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}

