class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and assign employee ID as long
        long employeeID = 1_234_567_890L;  // Employee ID within int range

        // Step 2: Explicitly convert long to int
        int convertedID = (int) employeeID;  

        // Step 3: Print both values
        System.out.println("Employee ID (Long): " + employeeID);
        System.out.println("Converted Employee ID (Int): " + convertedID);
    }
}
