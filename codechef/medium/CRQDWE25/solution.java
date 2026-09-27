class Codechef {
    public static void main (String[] args) {
        // Declare an integer variable for the vehicle number
        int vehicleNumber = 278;

        // Declare variables lastDigit and evenOdd to store the output.
        // Extract the last digit using modulus
        int lastDigit = vehicleNumber % 10;
        
        // Check if the number is even or odd using modulus
        int evenOdd = lastDigit % 2;

        // Print the results
        System.out.println("Last digit of vehicle number: " + lastDigit);
        System.out.println("Even/Odd check (0 = Even, 1 = Odd): " + evenOdd);
    }
}