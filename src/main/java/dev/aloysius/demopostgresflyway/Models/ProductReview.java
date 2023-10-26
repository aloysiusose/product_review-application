package dev.aloysius.demopostgresflyway.Models;

import java.util.List;

public record ProductReview (String name, double price, List<String> commentsList){

}
