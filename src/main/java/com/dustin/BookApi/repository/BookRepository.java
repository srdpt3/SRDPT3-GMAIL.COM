package com.dustin.BookApi.repository;

import com.dustin.BookApi.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {
    @RestResource(path = "categoryid")
    Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
