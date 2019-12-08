package filter;

import entities.Product;
import entities.ProductList;
import entities.ProductType;
import utils.Pair;

public class TypeFilter extends BaseFilter{
    private ProductType type;

    public TypeFilter(ProductType type) {

        this.type = type;
    }

    @Override
    public ProductList find(ProductList productList) {
        ProductList resultList = new ProductList();
        for (Product product:
                productList) {
            if(product.getType() == type){
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
