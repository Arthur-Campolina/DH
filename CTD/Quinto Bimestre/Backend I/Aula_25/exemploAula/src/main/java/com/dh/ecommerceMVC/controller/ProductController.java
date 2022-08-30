package com.dh.ecommerceMVC.controller;

import com.dh.ecommerceMVC.model.Product;
import com.dh.ecommerceMVC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/{id}")
    public Product getById(@RequestParam("id") int id) throws SQLException {
        return service.getById(id).isEmpty() ? new Product() : service.getById(id).get();
    }

    @GetMapping("/all")
    public List<Product> getAll() throws SQLException {
        return service.getAll();
    }

    @PutMapping
    public Product save(@RequestBody Product product) throws SQLException {
        return service.save(product);
    }

    @PostMapping
    public void update(@RequestBody Product product) throws SQLException {
        service.update(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestParam("id") int id) throws SQLException {
        service.delete(id);
    }


}
