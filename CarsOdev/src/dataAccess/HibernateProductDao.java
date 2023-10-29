package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        System.out.println(product.getId());
        System.out.println(product.getModel());
        System.out.println(product.getUnitPrice());

    }
}
