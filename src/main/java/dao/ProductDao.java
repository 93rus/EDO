package dao;

import model.Product;

import java.util.List;

/**
 * Created by Баранов on 23.05.2018.
 */
public interface ProductDao {
    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void removeProduct(int id);

    public Product getByProductId(int id);

    public List<Product> listProduct();
}
