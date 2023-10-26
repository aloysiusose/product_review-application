package dev.aloysius.demopostgresflyway.Repository;

import dev.aloysius.demopostgresflyway.Models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
