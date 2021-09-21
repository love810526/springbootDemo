package com.example.book;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Book {
    /*Entity : 建立資料庫的實體物件 */
    @Id
    @GeneratedValue
    private Integer  bookid;
    private String name;
    private String author;
}
