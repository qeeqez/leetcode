package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static com.qeeqez.leetcode.easy.DesignParkingSystem1603.ParkingSystem;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DesignParkingSystem1603Test {

    @Test
    public void testParkingSystem() {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

        assertTrue(parkingSystem.addCar(1));
        assertTrue(parkingSystem.addCar(2));
        assertFalse(parkingSystem.addCar(3));
        assertFalse(parkingSystem.addCar(1));
    }

}
