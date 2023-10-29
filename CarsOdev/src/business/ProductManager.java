package business;

import core.Logger;
import dataAccess.ProductDao;
import entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;


    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product){

        productDao.add(product);

        for (Logger logger : loggers
             ) {
            logger.log(product.getModel());
            logger.log(product.getId());
            logger.log(product.getUnitPrice());

        }
    }
}
