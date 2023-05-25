package com.paradigma.ecommerce.persistence;

import com.paradigma.ecommerce.application.ProductService;
import com.paradigma.ecommerce.domain.Product;
import java.util.List;

public class ProductServiceReverse implements ProductService {

  @Override
  public List<Product> getAllProducts() {
    Product product1 = new Product(1L, "3.31/DSS BG215/BG8/U5658-7i eroC letnI 1033 edutitaL lleD", "999,00 €");
    Product product2 = new Product(2L, "3.31 eveelS potpaL wolgriA etinosmaS", "41,34 €");
    Product product3 = new Product(3L, "581M esuoM sseleriW hcetigoL", "10,78 €");
    Product product4 = new Product(4L, "MaP ec ldleo soeksluaBwF", "1,34 €");

    return List.of(product1, product2, product3, product4);
  }
}
