package filter;

import entities.Product;
import entities.ProductList;
import utils.Pair;

public class ColorFilter extends BaseFilter {
    private String color;

    public ColorFilter(String color) {

        this.color = color;
    }

    @Override
    public ProductList find(ProductList productList) {
        ProductList resultList = new ProductList();
        for (Product product:
                productList) {
            if(product.getColor() == color){
                resultList.add(product);
            }
        }
        if(resultList.isEmpty()){
            return null;
        }else{
            return checkNext(resultList);
        }
    }
}
