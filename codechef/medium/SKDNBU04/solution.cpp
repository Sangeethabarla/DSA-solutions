# cook your dish here
class Codechef {
    public static void main (String[] args) {
        int item1 = 30;
        int item2 = 50;
        int discount = 10;

        // 1. Calculate total price and final price after discount
        int totalPrice = item1 + item2;
        int finalPrice = totalPrice - discount;

        // 2. Find average price per item
        int averagePrice = totalPrice / 2;

        // 3. Print the final bill details matching expected output
        System.out.println("Total Price is : " + totalPrice);
        System.out.println("Final Price after the discount is : " + finalPrice);
        System.out.println("Average Price is : " + averagePrice);
    }
}