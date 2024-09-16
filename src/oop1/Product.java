package oop1;

//Classlar PascalCase ile isimlendirilir
//ve ilk harfler her zaman BÜYÜK olur
//field lar ise camelCase yazılır

public class Product {

    private String name;
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitInStock;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitInStock() {
        return this.unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

}