module com.paradigma.ecommerce.api {
  requires com.paradigma.ecommerce.application;
  requires com.paradigma.ecommerce.domain;

  uses com.paradigma.ecommerce.application.ProductService;
}