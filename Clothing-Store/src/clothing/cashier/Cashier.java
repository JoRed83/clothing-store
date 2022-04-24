package clothing.cashier;

import clothing.cart.Cart;
import clothing.products.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cashier {

    private Cart cart;
    private LocalDateTime date;

    public Cashier(Cart cart, LocalDateTime date) {

        this.cart = cart;
        this.date = date;
    }

    public void printReceipt() {

        cart.calculateDiscountsForProuducts(date);

        this.printHeading();
        this.printBody();
        this.printFooter();
    }

    private void printHeading() {

        String dateString = this.date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(String.format("Date: %s", dateString));
        System.out.println();
        System.out.println("---Products---");
        System.out.println();
    }

    private void printBody() {

        for (Product product : cart.getProducts()) {

            System.out.println(product.printForReceipt());
            System.out.println();
        }
    }

    private void printFooter() {

        System.out.println("-----------------------------");
        System.out.println();
        System.out.println(String.format("SUBTOTAL: $%.2f", this.cart.calculateSubtotal()));
        System.out.println(String.format("DISCOUNT: $%.2f", this.cart.calculateTotalDiscount()));
        System.out.println();
        System.out.println(String.format("TOTAL: $%.2f", this.cart.calculateTotal()));
    }
}
