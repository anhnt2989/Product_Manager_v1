package com.codegym.service;

import com.codegym.model.Category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryServiceImpl implements CategoryService {
    public static Map<Integer, Category> categories;

    static {
        categories = new HashMap<>();
    }
    @Override
    public List<Category> findAll() {
        return new ArrayList<>(categories.values());
    }

    @Override
    public Category findById(int id) {
        return categories.get(id);
    }
}
