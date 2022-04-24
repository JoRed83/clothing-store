package clothing.products;

import clothing.constants.JacketTrousersSize;

public class Trousers extends Product {

    public Trousers(String name, String brand, Double price, String color) {
        super(name, brand, price, color);
    }

    public void setSize(JacketTrousersSize size) {

        super.setSize(size.getSize());
    }
}
