package com.springbootreact.Service;


import com.springbootreact.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface CategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category saveCategory(Category category);
    Category updateCategory(Long id, Category category);
    // Pode ser igual ao save
    boolean deleteCategory(Long id);

    Category createCategory(Category category);

    Object updateCategory(Category category);
}
