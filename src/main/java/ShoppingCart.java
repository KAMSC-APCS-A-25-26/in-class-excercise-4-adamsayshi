import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        // TODO: Use a for loop to read each item's price (double)
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int items = sc.nextInt();
        double fin = 0.0;
        for (int x=1; x < items+1; x++){
            System.out.print("Price of item " + x + "? ");
            fin += sc.nextDouble();
        }
        System.out.println("Your cart has " + items + " items with a total cost of $" + fin);
    }
}
