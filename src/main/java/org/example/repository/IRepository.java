package org.example.repository;

import org.example.model.Entity;

import java.util.List;

public interface IRepository<T extends Entity<Long>> {
    void add(T entity);
    void delete(Long id);
    void update(T entity);
    T findOne(Long id);
    List<T> findAll();
}