package entities;

import java.util.Objects;

public class Product {
    private Double price;
    private String color;
    private String size;
    private ProductType type;

    public Product(Double price, String color, String size, ProductType type) {
        this.price = price;
        this.color = color;
        this.size = size;
        this.type = type;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(price, product.price) &&
                Objects.equals(color, product.color) &&
                Objects.equals(size, product.size) &&
                type == product.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color, size, type);
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", type=" + type +
                '}';
    }
}
