package clothing.products;



import java.time.DayOfWeek;
import java.time.LocalDateTime;

import clothing.constants.ShirtSize;

public class Shirt extends Product {

    public Shirt(String name, String brand, Double price, String color) {
        super(name, brand, price, color);
    }

    @Override
    public int getProductDiscountPercent(LocalDateTime date) {

        if (date.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {

            return 10;
        }

        return 0;
    }

    public void setSize(ShirtSize size) {

        super.setSize(size.getSize());
    }
}
