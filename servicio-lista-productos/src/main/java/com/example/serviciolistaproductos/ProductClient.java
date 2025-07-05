package com.example.serviciolistaproductos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "servicio-productos")
public interface ProductClient {

    @GetMapping("/products")
    List<Product> getAllProducts();
}
