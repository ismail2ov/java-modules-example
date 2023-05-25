module com.paradigma.ecommerce.persistence {
  requires com.paradigma.ecommerce.application;
  requires com.paradigma.ecommerce.domain;

  provides com.paradigma.ecommerce.application.ProductService
      with
          com.paradigma.ecommerce.persistence.ProductServiceImpl,
          com.paradigma.ecommerce.persistence.ProductServiceReverse;
}