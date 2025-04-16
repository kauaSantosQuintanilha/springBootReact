package com.springbootreact.Service;

import com.springbootreact.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> getAllCategories() {
        // Implementação do método
        return null;
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        // Implementação do método
        return Optional.empty();
    }

    @Override
    public Category saveCategory(Category category) {
        // Implementação do método
        return null;
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        // Implementação do método
        return null;
    }

    @Override
    public boolean deleteCategory(Long id) {
        // Implementação do método
        return false;
    }

    @Override
    public Category createCategory(Category category) {
        // Implementação do método
        return null;
    }

    @Override
    public Object updateCategory(Category category) {
        // Implementação do método
        return null;
    }
}