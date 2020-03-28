package com.dustin.BookApi.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_category")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookCategory {

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public Set<Book> getBook() {
//        return book;
//    }
//
//    public void setBook(Set<Book> book) {
//        this.book = book;
//    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="category_name")
    private String categoryName;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="category")
    @JsonIgnoreProperties(value = {"category"})
    private Set<Book> book;
}
