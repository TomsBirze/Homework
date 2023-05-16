package io.codelex.classesandobjects.practice.Exercise1;

public class Products {
    public static void main(String[] args) {
        ProductArchive banana = new ProductArchive("banana", 1.1, 13);
        ProductArchive logitechMouse = new ProductArchive("Logitech mouse", 70.00, 14);
        ProductArchive iPhone5 = new ProductArchive("iPhone 5s", 999.99, 3);
        ProductArchive epson = new ProductArchive("Epson EB-U05", 440.46, 1);

        banana.setAmount(20);
        epson.setPrice(123.45);

        banana.productInfo();
        logitechMouse.productInfo();
        iPhone5.productInfo();
        epson.productInfo();
    }
}

