package com.dh.ecommerceMVC.dao;

import com.dh.ecommerceMVC.model.Product;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Idao <T>{

    Product save(Product product) throws SQLException;
    List<T> getAll() throws SQLException;
    void update(T t) throws SQLException;
    Optional<T> getById(int id) throws SQLException;
    void delete(int id) throws SQLException;
}
