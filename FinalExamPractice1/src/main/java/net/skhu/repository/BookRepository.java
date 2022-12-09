package net.skhu.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
//	List<Book> findBytitle(String title);
	
	Book findBytitle(String title);
	List<Book> findByauthor(String author);
	List<Book> findByTitleStartsWith(String title);
	List<Book> findByOrderByTitle();
	
}
