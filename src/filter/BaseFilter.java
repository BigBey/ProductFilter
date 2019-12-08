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

    public abstract Pair<Boolean, ProductList> find(ProductList productList);

    public Pair<Boolean, ProductList> checkNext(ProductList productList){
        if(nextFilter == null){
            return new Pair<>(false, productList);
        }

        return nextFilter.find(productList);
    }

    public BaseFilter getNextFilter() {
        return nextFilter;
    }//

    public void setNextFilter(BaseFilter nextFilter) {
        this.nextFilter = nextFilter;
    }
}
