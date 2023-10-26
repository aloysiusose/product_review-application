package dev.aloysius.demopostgresflyway.Controllers;

import dev.aloysius.demopostgresflyway.Models.ProductReview;
import dev.aloysius.demopostgresflyway.Models.Products;
import dev.aloysius.demopostgresflyway.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("products")
    public List<Products> allProducts(){
        return productService.allProducts();
    }

    @GetMapping("/review")
    public ProductReview review(@RequestParam String productName){
        return productService.productReview(productName);
    }

    @ExceptionHandler
    public ResponseEntity<?> handleException(Exception ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
