package io.codelex.oop.summary.generics.ordersAndInvoices;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {

        Item banana = new FoodItem("Java banana", 1.50, LocalDate.of(2023, 5, 31));
        Item toaster = new ElectronicsItem("Java toaster", 10.60, "100W");
        Item table = new HouseholdItem("Java table", 25.00, "gray");
        Item apple = new FoodItem("Java apple", 1.00, LocalDate.of(2023, 6, 10));
        Item chair = new HouseholdItem("Java chair", 8.00, "gray");

        Item rottenTomato = new FoodItem("Rotten Tomato", 0.50, LocalDate.of(2023, 5, 20));

        Order order = new Order();
        order.addItem(banana);
        order.addItem(toaster);
        order.addItem(table);
        order.addItem(apple);
        order.addItem(chair);

//        order.addItem(rottenTomato);
//        order.removeItem(rottenTomato);

        order.getOrderText();

        Invoice invoice = new Invoice(order, "nr123");

        invoice.getFormattedInvoice();
    }
}
