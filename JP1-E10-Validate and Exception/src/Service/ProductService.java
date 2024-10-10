package Service;

import Entity.Product;
import Validator.ProductValidator;
import Exceptions.NotEnoughInventoryNumberException;
import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private Map<String, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        ProductValidator.validate(product);
        if (productMap.containsKey(product.getId())) {
            throw new IllegalArgumentException("Sản phẩm đã tồn tại.");
        }
        productMap.put(product.getId(), product);
    }

    public Product findProductById(String id) {
        return productMap.get(id);
    }

    public void updateProductQuantity(String id, int quantity) {
        Product product = findProductById(id);
        product.setQuantity(quantity);
    }

    public void checkInventory(String productId, int requiredQuantity) {
        Product product = findProductById(productId);
        if (product.getQuantity() < requiredQuantity) {
            throw new NotEnoughInventoryNumberException("Không đủ số lượng tồn kho.");
        }
    }
}

