package clothing.products;

import java.time.LocalDateTime;

public abstract class Product {

    protected String name;
    protected String brand;
    protected Double price;
    protected String size;
    protected String color;
    protected int discountPercent = 0;

    public Product(String name, String brand, Double price, String color) {

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String printForReceipt() {

        return String.format("%s - %s%n$%.2f%s", this.name, this.brand, this.price, this.printDiscount());
    }

    private String printDiscount() {

        if (discountPercent == 0) {

            return "";
        }

        return String.format("%n#discount %d%% - $%.2f", this.discountPercent, this.price*this.discountPercent/100);
    }

    public int getProductDiscountPercent(LocalDateTime date) {

        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void setSize(String size) {

        this.size = size;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
}
