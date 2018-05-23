package service;

import dao.ProductDao;
import model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Баранов on 23.05.2018.
 */
@Service
public class ProductControllerImpl implements ProductController {
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        this.productDao.addProduct(product);

    }

    @Override
    @Transactional
    public void updateProduct(Product product) {
        this.productDao.updateProduct(product);

    }

    @Override
    @Transactional
    public void removeProduct(int id) {
        this.productDao.removeProduct(id);

    }

    @Override
    public Product getByProductId(int id) {
        return this.productDao.getByProductId(id);
    }

    @Override
    public List<Product> listProduct() {
        return this.productDao.listProduct();
    }
}
