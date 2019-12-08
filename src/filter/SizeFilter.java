package filter;

import entities.Product;
import entities.ProductList;
import utils.Pair;

public class SizeFilter extends BaseFilter{
    private String size;

    public SizeFilter(String size) {

        this.size = size;
    }

    @Override
    public ProductList find(ProductList productList) {
        ProductList resultList = new ProductList();
        for (Product product:
                productList) {
            if(product.getSize().equals(size)){
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
