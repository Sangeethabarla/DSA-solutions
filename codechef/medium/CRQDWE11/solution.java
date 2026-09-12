class Codechef {
    public static void main (String[] args) {
        // Declare integer variables for poster inventory
        int totalPosters = 200, removedPosters = 75, newPosters = 40;

        // Calculate the updated stock
        int updatedStock = totalPosters - removedPosters + newPosters;

        // Print the updated stock
        System.out.println(updatedStock);
    }
}