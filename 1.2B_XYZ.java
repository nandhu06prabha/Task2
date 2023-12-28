//To get the input from the user
import java.util.Scanner;

public class XYZ {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      //five product information from the user where store in the array
      Product[] products = new Product[5];
      for (int i = 0; i < 5; i++) {
          System.out.println("Enter the product details " + (i + 1) + ":");
          System.out.print("Enter Product ID: ");
          int pid = scanner.nextInt();
          System.out.print("Enter the Price: ");
          double price = scanner.nextDouble();
          System.out.print("Enter the Quantity: ");
          int quantity = scanner.nextInt();

          products[i] = new Product(pid, price, quantity);
      }

      // Find highest price of the product
      int pidProductHighestPrice = findHighestPricePid(products);
      System.out.println("\nProduct with the highest price Pid: " + pidProductHighestPrice);

      // Calculate and display the total amount spent on all products
      double amountSpent = calculateTotalAmountSpent(products);
      System.out.println("\nTotal amount spent on all products: " + amountSpent);

      scanner.close();
  }

  // Method to find Pid of the product with the highest price
  private static int findHighestPricePid(Product[] products) {
      int highestPricePid = -1;
      double highestPrice = Double.MIN_VALUE;

      for (Product product : products) {
          if (product.getPrice() > highestPrice) {
              highestPrice = product.getPrice();
              highestPricePid = product.getPid();
          }
      }

      return highestPricePid;
  }

  // Method to calculate and return the total amount spend on all products
  private static double calculateTotalAmountSpent(Product[] products) {
      double amountSpent = 0;

      for (Product product : products) {
          amountSpent += product.getPrice() * product.getQuantity();
      }

      return amountSpent;
  }
}
