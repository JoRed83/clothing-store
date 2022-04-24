package clothing;


import clothing.constants.JacketTrousersSize;
import clothing.constants.ShirtSize;
import clothing.constants.ShoesSize;
import clothing.cart.Cart;
import clothing.products.Jacket;
import clothing.products.Shirt;
import clothing.products.Shoes;
import clothing.products.Trousers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DataProvider {

    public Cart getCartOne() {

        Shirt product1 = new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "blue");
        product1.setSize(ShirtSize.SIZE_M);

        Shirt product2 = new Shirt("White Cotton Shirt", "BrandS", 15.99, "white");
        product1.setSize(ShirtSize.SIZE_M);

        Trousers product3 = new Trousers("Black Cotton Trousers", "BrandT", 29.99, "black");
        product3.setSize(JacketTrousersSize.SIZE_50);

        Shoes product4 = new Shoes("Black Leather Shoes", "BrandS", 59.99, "black");
        product4.setSize(ShoesSize.SIZE_43);

        Jacket product5 = new Jacket("Black Cotton Suit Jacket", "BrandJ", 99.99, "black");
        product5.setSize(JacketTrousersSize.SIZE_50);

        return new Cart(Arrays.asList(product1, product2, product3, product4, product5));
    }

    public LocalDateTime getDateOne() {

        return LocalDateTime.parse("2022-02-02 12:34:56", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Cart getCartTwo() {

        Shirt product1 = new Shirt("Black Silk Shirt", "BrandS", 29.99, "black");
        product1.setSize(ShirtSize.SIZE_L);

        Shirt product2 = new Shirt("White Silk Shirt", "BrandS", 29.99, "white");
        product2.setSize(ShirtSize.SIZE_L);
        return new Cart(Arrays.asList(product1, product2));
    }

    public LocalDateTime getDateTwo() {

        return LocalDateTime.parse("2022-02-01 12:34:56", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Cart getCartThree() {
    	
    	Trousers product1 = new Trousers("Red Linen Trousers", "BrandT", 49.99, "red");
        product1.setSize(JacketTrousersSize.SIZE_56);

        Shoes product2 = new Shoes("Red Suede Shoes", "BrandS", 59.99, "red");
        product2.setSize(ShoesSize.SIZE_44);

        Shoes product3 = new Shoes("Black Suede Shoes", "BrandS", 59.99, "black");
        product3.setSize(ShoesSize.SIZE_44);

        Jacket product4 = new Jacket("Red Linen Suit Jacket", "BrandJ", 99.99, "red");
        product4.setSize(JacketTrousersSize.SIZE_56);
        
        Shirt product5 = new Shirt("White Linen Shirt", "BrandS", 29.99, "white");
        product5.setSize(ShirtSize.SIZE_L);


        return new Cart(Arrays.asList(product1, product2, product3, product4, product5));
    }

    public LocalDateTime getDateThree() {

        return LocalDateTime.parse("2022-02-01 12:34:56", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
