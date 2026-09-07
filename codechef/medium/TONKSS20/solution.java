class Codechef {
    public static void main (String[] args) {
        double currentTemperature = 25.2; // Accessible globally

        {
            float morningTemperature = 18.5f; // Block-level variable
            System.out.println("Morning Temperature: " + morningTemperature);
        }

        System.out.println("Current Temperature: " + currentTemperature);
    }
}