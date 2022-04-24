package clothing;

import clothing.cashier.Cashier;

public class Main {

    public static void main(String[] args) {

        DataProvider dataProvider = new DataProvider();
        
        Cashier cashier = new Cashier(dataProvider.getCartTwo(), dataProvider.getDateTwo());
        cashier.printReceipt();
    }
}
