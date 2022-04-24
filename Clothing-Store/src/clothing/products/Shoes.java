package clothing.products;



import java.time.DayOfWeek;
import java.time.LocalDateTime;

import clothing.constants.ShoesSize;

public class Shoes extends Product {

    public Shoes(String name, String brand, Double price, String color) {
        super(name, brand, price, color);
    }

    @Override
    public int getProductDiscountPercent(LocalDateTime date) {

        if (date.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {

            return 25;
        }

        return 0;
    }

    public void setSize(ShoesSize size) {

        super.setSize(size.getSize());
    }
}
