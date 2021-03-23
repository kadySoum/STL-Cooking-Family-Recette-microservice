package com.STLCookingFamily.recettes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.STLCookingFamily.recettes.entity.Recette;

public interface RecetteRepository extends JpaRepository<Recette, Long> {
    List<Recette> findByPublished(boolean published);
    List<Recette> findByTitleContaining(String title);
}
