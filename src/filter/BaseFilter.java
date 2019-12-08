package filter;

import entities.Product;
import entities.ProductList;
import utils.Pair;

import java.lang.reflect.Type;
import java.util.AbstractMap;

abstract public class BaseFilter{

    protected BaseFilter nextFilter;



    public BaseFilter addFilter(BaseFilter nextFilter){
        this.nextFilter = nextFilter;
        return nextFilter;
    }

    public abstract ProductList find(ProductList productList);

    public ProductList checkNext(ProductList productList){
        if(nextFilter == null){
            return productList;
        }

        return nextFilter.find(productList);
    }
}
