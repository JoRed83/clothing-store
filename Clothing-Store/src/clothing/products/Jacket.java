package clothing.products;

import clothing.constants.JacketTrousersSize;

public class Jacket extends Product {

    public Jacket(String name, String brand, Double price, String color) {
        super(name, brand, price, color);
    }

    public void setSize(JacketTrousersSize size) {

        super.setSize(size.getSize());
    }
}
