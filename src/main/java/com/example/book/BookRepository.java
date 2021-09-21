package com.example.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BookRepository extends JpaRepository<Book, Integer> {
    /*建立操作資料物件的 Repository ==> 透過 Spring Data JPA 提供的功能, 我們不必真的寫一堆配置跟Dao物件就可以進行操作了 */
}
