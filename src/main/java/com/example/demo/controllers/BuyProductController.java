package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import java.util.Optional;

@Controller
public class BuyProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/buyProduct")
    public String buyProduct(@RequestParam("productId") Long productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);

        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();

            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "redirect:/purchase-success";
            }
        }

        return "redirect:/purchase-error";
    }

    @GetMapping("/purchase-success")
    public String displayPurchaseSuccess() {
        return "purchase-success";
    }

    @GetMapping("/purchase-error")
    public String displayPurchaseError() {
        return "purchase-error";
    }
}
