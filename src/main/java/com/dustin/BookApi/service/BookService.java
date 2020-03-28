package com.dustin.BookApi.service;

import com.dustin.BookApi.model.Book;
import com.dustin.BookApi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book saveProduct(Book product) {
        return repository.save(product);
    }

    public List<Book> saveProducts(List<Book> products) {
        return repository.saveAll(products);
    }

    public List<Book> getProducts() {
        return repository.findAll();
    }

    public Book getProductById(long id) {
        return repository.findById(id).orElse(null);
    }

//    public Book getProductByName(String name) {
//        return repository.findByName(name);
//    }

    public String deleteProduct(long id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

//    public Book updateProduct(Book book) {
//        Book existingProduct = repository.findById(book.getId()).orElse(null);
//        existingProduct.setName(book.getName());
//        existingProduct.setQuantity(book.getQuantity());
//        existingProduct.setPrice(book.getPrice());
//        return repository.save(existingProduct);
//    }

}
