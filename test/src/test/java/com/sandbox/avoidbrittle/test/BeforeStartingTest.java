package com.sandbox.avoidbrittle.test;

public interface BeforeStartingTest {

    static void displayStartingMessage(String testName) {
        System.out.println("[INFO] -------------------------------------------------------");
        System.out.println("[INFO] ");
        System.out.println("[INFO] TESTING FOR " + testName.toUpperCase() + " IN PROGRESS");
        System.out.println("[INFO] ");
        System.out.println("[INFO] -------------------------------------------------------");
    }

}
