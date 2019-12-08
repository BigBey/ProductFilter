package entities;

import java.util.ArrayList;
import java.util.Collection;

public class ProductList extends ArrayList<Product>{

    public ProductList(int initialCapacity) {
        super(initialCapacity);
    }

    public ProductList() {
    }

    public ProductList(Collection<? extends Product> c) {
        super(c);
    }

    @Override
    public String toString() {
        String result = "";
        for (Product product:
             this) {
            result = result + product.toString();
            result = result + "\n";
        }
        return result;
    }


}
