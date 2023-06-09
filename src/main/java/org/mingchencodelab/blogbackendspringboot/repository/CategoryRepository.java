package org.mingchencodelab.blogbackendspringboot.repository;

import org.mingchencodelab.blogbackendspringboot.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "categories", collectionResourceRel = "categories", itemResourceRel = "categories")
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
