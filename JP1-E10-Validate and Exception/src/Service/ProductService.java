package Service;

import Entity.Product;
import IGeneric.IGenericService;
import Validator.ProductValidator;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IGenericService<Product> {
    private List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        ProductValidator.validateProductId(product.getId());
        products.add(product);
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void update(Product product) {
    }

    @Override
    public void deleteById(int id) {
    }
}




