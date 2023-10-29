import business.ProductManager;
import core.DatabaseLogger;
import core.Logger;
import dataAccess.HibernateProductDao;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Renault","Megane",10000);
        Product product2 = new Product("Audi","A3",100000);
        Product product3 = new Product("Mercedes","A180",20000);
        Product product4 = new Product("Fiat","Linea",5000);
        Logger[] loggers = {new DatabaseLogger()};
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);

    }
}

