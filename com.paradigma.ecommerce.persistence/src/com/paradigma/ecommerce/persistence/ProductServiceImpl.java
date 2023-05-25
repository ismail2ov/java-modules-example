package com.paradigma.ecommerce.persistence;

import com.paradigma.ecommerce.application.ProductService;
import com.paradigma.ecommerce.domain.Product;
import java.util.List;

public class ProductServiceImpl implements ProductService {

  @Override
  public List<Product> getAllProducts() {
    Product product1 = new Product(1L, "Dell Latitude 3301 Intel Core i7-8565U/8GB/512GB SSD/13.3", "999,00 €");
    Product product2 = new Product(2L, "Samsonite Airglow Laptop Sleeve 13.3", "41,34 €");
    Product product3 = new Product(3L, "Logitech Wireless Mouse M185", "10,78 €");
    Product product4 = new Product(4L, "Fellowes Mouse Pad Black", "1,34 €");

    return List.of(product1, product2, product3, product4);
  }
}
