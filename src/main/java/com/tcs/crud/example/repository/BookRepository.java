package com.tcs.crud.example.repository;

import com.tcs.crud.example.entity.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>{

	List<Book> findByTitle(String title);

	List<Book> findByAuthname(String authname);

	List<Book> findByIsbn(String isbn);	
	
}
