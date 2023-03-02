package com.qeeqez.leetcode.easy;

/**
 * 1603. Design Parking System
 * <p>
 * Design a parking system for a parking lot.
 * The parking lot has three kinds of parking spaces: big, medium, and small,
 * with a fixed number of slots for each size.
 * <p>
 * Implement the ParkingSystem class:
 * <p>
 * ParkingSystem(int big, int medium, int small)
 * Initializes object of the ParkingSystem class.
 * The number of slots for each parking space are given as part of the constructor.
 * <p>
 * bool addCar(int carType)
 * Checks whether there is a parking space of carType for the car that wants to get into the parking lot.
 * carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively.
 * A car can only park in a parking space of its carType.
 * If there is no space available, return false, else park the car in that size space and return true.
 */
public class DesignParkingSystem1603 {

    static class ParkingSystem {

        private final int bigSlots;
        private final int mediumSlots;
        private final int smallSlots;

        private int currentBig;
        private int currentMedium;
        private int currentSmall;

        public ParkingSystem(int big, int medium, int small) {
            bigSlots = big;
            mediumSlots = medium;
            smallSlots = small;
        }

        public boolean addCar(int carType) {
            switch (carType) {
                case 1 -> {
                    if (currentBig == bigSlots) return false;
                    currentBig++;
                }
                case 2 -> {
                    if (currentMedium == mediumSlots) return false;
                    currentMedium++;
                }
                case 3 -> {
                    if (currentSmall == smallSlots) return false;
                    currentSmall++;
                }
            }

            return true;
        }
    }

}

