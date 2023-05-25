package com.paradigma.ecommerce.api;

import com.paradigma.ecommerce.application.ProductService;
import java.util.ServiceLoader;

public class Main {

  public static void main(String[] args) {
    ServiceLoader<ProductService> serviceLoader = ServiceLoader.load(ProductService.class);

    serviceLoader.stream()
        .map(ServiceLoader.Provider::get)
        .map(ProductService::getAllProducts)
        .forEach(products -> products.forEach(System.out::println));
  }

}
