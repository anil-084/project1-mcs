package collections;

import java.util.ArrayList;
import java.util.List;

public class FilteringCollectionData {

    static void main() {
        List<Products> productsList = new ArrayList<Products>();
        //Adding Products
        productsList.add(new Products(1,"HP Laptop",25000f));
        productsList.add(new Products(2,"Dell Laptop",30000f));
        productsList.add(new Products(3,"Lenevo Laptop",28000f));
        productsList.add(new Products(4,"Sony Laptop",28000f));
        productsList.add(new Products(5,"Apple Laptop",90000f));
          List list = productsList.stream().
                   filter(p->p.price<30000).
                  map(products -> products.price).
                   toList();
        System.out.println(list);

        float totalPrice = productsList.stream().
                map(products -> products.price).reduce(0.0f,Float::sum);
        System.out.println(totalPrice);
    }

}
