package com.company;

import entities.Product;
import entities.ProductList;
import entities.ProductType;
import filter.BaseFilter;
import filter.ColorFilter;
import filter.PriceFilter;
import filter.SizeFilter;
import utils.Pair;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.add(new Product(45d, "black", "45", ProductType.SOCKS));
        productList.add(new Product(43d, "red", "s", ProductType.T_SHIRT));
        productList.add(new Product(45d, "red", "s", ProductType.T_SHIRT));
        BaseFilter filter = new PriceFilter(new Pair<>(40d, 50d));
        filter.addFilter(new ColorFilter("red"));
        //sizeFilter.setProductList(productList);
        try {
            System.out.println(filter.find(productList).toString());
        }catch (NullPointerException e){
            System.out.println("Товаров не найдено");
        }
    }
}
