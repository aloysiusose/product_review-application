package dev.aloysius.demopostgresflyway.Service;

import dev.aloysius.demopostgresflyway.Models.Comments;
import dev.aloysius.demopostgresflyway.Models.ProductReview;
import dev.aloysius.demopostgresflyway.Models.Products;
import dev.aloysius.demopostgresflyway.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    public List<Products> allProducts(){
        return productRepository.findAll();
    }

    public ProductReview productReview(String productName){

        Optional<Products> byProductName = productRepository.findByProductName(productName);
        return byProductName.map(this::toReview).orElseGet(() -> new ProductReview("product not found", 0, null));

    }

    private ProductReview toReview(Products products){
        return new ProductReview(products.getProductName(), products.getProductPrice(),
                products.getCommentsList().stream().map(Comments::getComment).collect(Collectors.toList()));
    }
}
