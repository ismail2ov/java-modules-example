package com.paradigma.ecommerce.api;

import com.paradigma.ecommerce.application.ProductService;
import java.util.ServiceLoader;

public class Main {

  public static void main(String[] args) throws ClassNotFoundException {
    ServiceLoader<ProductService> serviceLoader = ServiceLoader.load(ProductService.class);

    ProductService productService = serviceLoader.findFirst().orElseThrow(ClassNotFoundException::new);
    productService.getAllProducts().forEach(System.out::println);
  }

}
