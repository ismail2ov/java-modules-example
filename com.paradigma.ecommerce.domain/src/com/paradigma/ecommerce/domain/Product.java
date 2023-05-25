package com.paradigma.ecommerce.domain;

public class Product {

  private final Long id;

  private final String name;

  private final String price;

  public Product(Long id, String name, String price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", price='" + price + '\'' +
        '}';
  }
}
