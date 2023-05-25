package com.paradigma.ecommerce.api;

import com.paradigma.ecommerce.api.persistence.ProductServiceImpl;
import com.paradigma.ecommerce.application.ProductService;

public class Main {

  public static void main(String[] args) {
    ProductService productService = new ProductServiceImpl();

    productService.getAllProducts().forEach(System.out::println);
  }

}
