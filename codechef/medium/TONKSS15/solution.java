class Codechef {
    public static void main (String[] args) {
        // Declare and assign student roll number as int
        int rollNumber = 12345; // Roll number within short range
        
        // Explicitly convert int to short
        short convertedRollNumber = (short) rollNumber;
        
        // Declare and assign student pass status
        boolean hasPassed = true; // True if the student has passed, false otherwise
        
        // Print all values
        System.out.println("Student Roll Number (Int): " + rollNumber);
        System.out.println("Converted Roll Number (Short): " + convertedRollNumber);
        System.out.println("Has Passed: " + hasPassed);
    }
}