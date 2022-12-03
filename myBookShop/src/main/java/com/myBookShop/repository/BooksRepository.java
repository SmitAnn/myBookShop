package com.myBookShop.repository;

import org.springframework.data.repository.CrudRepository;

import com.myBookShop.model.Books;

public interface BooksRepository extends CrudRepository<Books,Integer> {

}
