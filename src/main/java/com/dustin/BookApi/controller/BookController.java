package com.dustin.BookApi.controller;

import com.dustin.BookApi.model.Book;
import com.dustin.BookApi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

//   @Autowired
//    private KafkaTemplate<String, Object> template;

//    @Autowired
//    private RepositoryConfig template;

    private String topic = "dustin";
    @Autowired
    private BookService service;

    @PostMapping("/addProduct")
    public Book addProduct(@RequestBody Book product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Book> addProducts(@RequestBody List<Book> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Book> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Book findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }



    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

//    // KAFKA
//    @GetMapping("/publish/product/{name}")
//    public String publishMessage(@PathVariable int name) {
//        template.send(topic, "Publish product "+ name);
//        return "Message got published";
//    }


//    @GetMapping("/publishJson")
//    public String publishMessage() {
//        User user = new User(2532, "User88", new String[] { "Bangalore", "BTM", "house 90" });
//        template.send(topic, user);
//        return "Json Data published";
//    }
}
