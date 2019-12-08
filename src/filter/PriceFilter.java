package filter;

import entities.Product;
import entities.ProductList;
import utils.Pair;

import java.lang.reflect.Type;
import java.util.AbstractMap;

public class PriceFilter extends BaseFilter{
    private Pair<Double, Double> priceRange;

    public PriceFilter(Pair<Double, Double> priceRange) {

        this.priceRange = priceRange;
    }

    @Override
    public Pair<Boolean, ProductList> find(ProductList productList) {
        ProductList resultList = new ProductList();
        for (Product product:
                productList) {
            if(product.getPrice() >= priceRange.first && product.getPrice() <= priceRange.second){
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
