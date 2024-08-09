package com.library.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.api.entity.Book;

//extending the class jpa repository provides all the CRUD method or function
public interface BookRepository extends JpaRepository<Book, Integer> {

}
