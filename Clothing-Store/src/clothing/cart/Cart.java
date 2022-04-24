package clothing.cart;

import clothing.products.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<Product>();

    public Cart() {

    }

    public Cart(List<Product> products) {

        this.products = products;
    }

    public int getCartDiscountPercent() {

        if (products.size() >= 3) {
            return 20;
        }

        return 0;
    }

    public void addProduct(Product product) {

        this.products.add(product);
    }

    public List<Product> getProducts() {

        return this.products;
    }

    public void calculateDiscountsForProuducts(LocalDateTime date) {

        for (Product product : this.products) {

            product.setDiscountPercent(Math.max(this.getCartDiscountPercent(), product.getProductDiscountPercent(date)));
        }
    }

    public double calculateSubtotal() {

        double subtotal = 0;

        for (Product product : this.products) {

            subtotal += product.getPrice();
        }

        return subtotal;
    }

    public double calculateTotalDiscount() {

        double totalDiscount = 0;

        for (Product product : this.products) {

            totalDiscount += (product.getPrice() * product.getDiscountPercent() / 100);
        }

        return  totalDiscount;
    }

    public double calculateTotal() {

        double total = 0;

        for (Product product : this.products) {

            total += product.getPrice() * (100 - product.getDiscountPercent()) / 100;
        }

        return total;
    }
}
