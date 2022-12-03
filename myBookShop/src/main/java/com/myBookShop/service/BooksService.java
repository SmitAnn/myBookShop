package com.myBookShop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myBookShop.model.Books;
import com.myBookShop.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
  BooksRepository booksRepository;
//  getting all books record by using the method findAll() of CrudRepository
	
	public List<Books> getAllBooks()
	{
		List<Books>books=new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}
// getting a specific record by using the method findById() of CrudRepository
	
	public Books getBooksById(int id) {
		return booksRepository.findById(id).get();
	}
	
//	Saving a specific record by using the method save() of CurdRepository
	public void saveOrUpdate(Books books) 
	{
		booksRepository.save(books);
	}
	
// deteltin a specific record by using the method deleteById() of CrudRepository

	public void delete(int id)
	{
		booksRepository.deleteById(id);
	}
// Updating record
	
	public void update(Books books ,int bookid)
	{
		booksRepository.save(books);
	}
}
