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
    public Pair<Boolean, ProductList> find(ProductList productList) {
        ProductList resultList = new ProductList();
        for (Product product:
                productList) {
            if(product.getColor() == color){
                resultList.add(product);
            }
        }
        if(resultList.isEmpty()){
            return new Pair<>(false, null);
        }else{
            return checkNext(resultList);
        }
    }
}
