package io.codelex.oop.summary.ordersAndInvoices;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private static final double VAT_RATE = 0.21;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");

    private final String invoiceNumber;
    private final List<SellableThings> items;
    private InvoiceStatus status;
    private double totalPrice;
    private double totalVat;

    public Invoice(Order order, String invoiceNumber) {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("Cannot create invoice with an empty order.");
        }
        this.invoiceNumber = invoiceNumber;
        this.items = new ArrayList<>(order.getItems());
        this.status = InvoiceStatus.APPROVED;
        calculateTotalPrice();
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }

    private void calculateTotalPrice() {
        totalPrice = 0.0;
        totalVat = 0.0;
        for (SellableThings item : items) {
            totalPrice += item.getPrice();
        }
        totalVat = totalPrice * VAT_RATE;
    }

    private void formatInvoiceItems() {
        int index = 1;
        for (SellableThings item : items) {
            System.out.println("= " + index + ". " + item.getFullInfo());
            index++;
        }
    }

    public void getFormattedInvoice() {
        System.out.println("===================================================");
        System.out.println("= INVOICE NUMBER: " + invoiceNumber);
        System.out.println("= STATUS: " + status);

        formatInvoiceItems();

        System.out.println("= SUM: " + DECIMAL_FORMAT.format(totalPrice) + " EUR");
        System.out.println("= VAT (" + (VAT_RATE * 100) + "%): " + DECIMAL_FORMAT.format(totalVat) + " EUR");
        System.out.println("= TOTAL: " + DECIMAL_FORMAT.format(totalPrice + totalVat) + " EUR");
        System.out.println("===================================================");
    }

    public class WrongOrderException extends RuntimeException {
        public WrongOrderException(String message) {
            super(message);
        }
    }
}


