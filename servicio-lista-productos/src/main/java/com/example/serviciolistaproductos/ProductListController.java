package com.example.serviciolistaproductos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductListController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/")
    public String viewProductList(Model model) {
        try {
            // Llama al otro microservicio para obtener la lista de productos
            model.addAttribute("products", productClient.getAllProducts());
        } catch (Exception e) {
            // Si el servicio de productos no está disponible, se mostrará un error.
            model.addAttribute("error", "El servicio de productos no está disponible en este momento.");
        }
        return "product-list"; // Este es el nombre del archivo HTML
    }
}
