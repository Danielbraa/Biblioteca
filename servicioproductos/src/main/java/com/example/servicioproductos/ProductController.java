package com.example.servicioproductos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    @ResponseBody // Importante para la comunicación entre servicios
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listProducts", productRepository.findAll());
        model.addAttribute("product", new Product());
        return "index";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productRepository.save(product);
        return "redirect:/";
    }
}
