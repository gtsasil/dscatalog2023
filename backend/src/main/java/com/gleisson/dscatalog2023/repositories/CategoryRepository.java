package com.gleisson.dscatalog2023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gleisson.dscatalog2023.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{
}
